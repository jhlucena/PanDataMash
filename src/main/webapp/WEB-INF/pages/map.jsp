<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Mapa de Comercios</title>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <style>
        #map-canvas {
            margin: 0;
            padding: 25px;
            width: 1280px;
            height:600px;
        }

        .text {
            font-weight:normal;
            color:#000000;
            letter-spacing:2pt;
            padding-top: 5px;
            padding-bottom: 5px;
            word-spacing:2pt;
            font-size:26px;
            text-align:left;
            font-family:arial, helvetica, sans-serif;
            line-height:1;
        }

        body {
            font: normal 11px auto "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
            color: #4f6b72;
            background: #E6EAE9;
        }

        a {
            color: #c75f3e;
        }

        #mytable {
            width: 700px;
            padding: 0;
            margin: 0;
        }

        caption {
            padding: 0 0 5px 0;
            width: 700px;
            font: italic 11px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
            text-align: right;
        }

        th {
            font: bold 11px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
            color: #4f6b72;
            border-right: 1px solid #C1DAD7;
            border-bottom: 1px solid #C1DAD7;
            border-top: 1px solid #C1DAD7;
            letter-spacing: 2px;
            text-transform: uppercase;
            text-align: left;
            padding: 6px 6px 6px 12px;
            background: #CAE8EA url(/resources/images/bg_header.jpg) no-repeat;
        }

        th.nobg {
            border-top: 0;
            border-left: 0;
            border-right: 1px solid #C1DAD7;
            background: none;
        }

        td {
            border-right: 1px solid #C1DAD7;
            border-bottom: 1px solid #C1DAD7;
            background: #fff;
            padding: 6px 6px 6px 12px;
            color: #4f6b72;
        }


        td.alt {
            background: #F5FAFA;
            color: #797268;
        }

        th.spec {
            border-left: 1px solid #C1DAD7;
            border-top: 0;
            background: #fff url(/resources/images/bullet1.gif) no-repeat;
            font: bold 10px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
        }

        th.specalt {
            border-left: 1px solid #C1DAD7;
            border-top: 0;
            background: #f5fafa url(/resources/images/bullet2.gif) no-repeat;
            font: bold 10px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
            color: #797268;
        }
        
        .cols {
            float: left;
        }
    </style>
    <script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
    <script>
        var map;
        function initialize() {
            var mapOptions = {
                zoom: 10,
                center: new google.maps.LatLng(18.2613, -66.4360),
                mapTypeId: google.maps.MapTypeId.TERRAIN
            };
            map = new google.maps.Map(document.getElementById('map-canvas'),
                    mapOptions);

            setMarkers(map, locations);
        }

        var locations = [
            <c:forEach items="${comercios}" var="item" varStatus="status">
            <c:if test="${!(status.count == 0)}">
            [ '${item.name}', ${item.latitude}, ${item.longitude} ] <c:if test="${!status.last}">,
            </c:if>
            </c:if>
            </c:forEach>
        ];

        function setMarkers(map, locations) {
            // Add markers to the map

            // Marker sizes are expressed as a Size of X,Y
            // where the origin of the image (0,0) is located
            // in the top left of the image.

            // Origins, anchor positions and coordinates of the marker
            // increase in the X direction to the right and in
            // the Y direction down.
            var image = '/resources/images/grocery.png';

            // Shapes define the clickable region of the icon.
            // The type defines an HTML &lt;area&gt; element 'poly' which
            // traces out a polygon as a series of X,Y points. The final
            // coordinate closes the poly by connecting to the first
            // coordinate.
            var shape = {
                coord: [1, 1, 1, 32, 18, 32, 18 , 1],
                type: 'poly'
            };
            for (var i = 0; i < locations.length; i++) {
                var comercio = locations[i];
                var myLatLng = new google.maps.LatLng(comercio[1], comercio[2]);
                var marker = new google.maps.Marker({
                    position: myLatLng,
                    icon: image,
                    map: map,

                    title: comercio[0]
                });
            }
        }


        google.maps.event.addDomListener(window, 'load', initialize);

    </script>
</head>
<body>
<div id="title" class="text">Mapa de Comercios que proveen Servicio de PAN</div>
<div id="map-canvas" class="cols"></div>
<div id="list" class="cols">
    <table>
        <tr>
            <th>Comercio</th>
            <th>Latitud</th>
            <th>Longitud</th>
        </tr>
        <c:forEach var="item" items="${comercios}">
            <tr>
                <td><c:out value="${item.name}"/></td>
                <td><c:out value="${item.latitude}"/></td>
                <td><c:out value="${item.longitude}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>