<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Mapa de Comercios</title>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <style>
        #map-canvas {
            padding: 25px;
            width: 1280px;
            height:600px;
            margin: 10px 10px 0;
            border: 1px solid black;
        }

        .title {
            height: 75px;
            font-weight:bold;
            color:white;
            background: black;
            padding-top: 5px;
            padding-bottom: 5px;
            padding-left: 50px;
            font-size:28px;
            text-align:left;
            font-family:Arial,serif;
            font-variant:small-caps;
        }

        body {
            font: normal 11px auto "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
            color: #4f6b72;
            background: #E6EAE9;
        }

        a {
            color: #c75f3e;
        }

        .mytable {
            padding-left: 20px;

        }

        .mytabletitle {
            padding-left: 20px;
            font-variant-caps: small-caps;
            font-family: Arial, serif;
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
        var src = encodeURI('http://localhost:8080/resources/pr_counties.kml');

        function initialize() {
            var mapOptions = {
                zoom: 9,
                center: new google.maps.LatLng(18.2613, -66.4360),
                mapTypeId: google.maps.MapTypeId.ROADMAP
            };
            map = new google.maps.Map(document.getElementById('map-canvas'),
                    mapOptions);

            setMarkers(map, locations);
            //alert(src);
            loadKmlLayer(src, map);
        }

        var locations = [
            <c:forEach items="${comercios}" var="item" varStatus="status">
            <c:if test="${!(status.count == 0)}">
            [ '${item.name}', ${item.latitude}, ${item.longitude}, '${item.infoText}' ] <c:if test="${!status.last}">,
            </c:if>
            </c:if>
            </c:forEach>
        ];

        // Not yet working! Need to fix
        function loadKmlLayer(src, map)
        {
            var kmlLayer = new google.maps.KmlLayer( src, {
                supressInfoWindows: true,
                map: map
            });
        }

        function listenInfoWindows(marker, infowindow) {
            google.maps.event.addListener(marker, 'click', function(){
                        infowindow.open(map, marker);
                    }
            );
        }

        function setMarkers(map, locations ) {
            // Add markers to the map

            // Marker sizes are expressed as a Size of X,Y
            // where the origin of the image (0,0) is located
            // in the top left of the image.

            // Origins, anchor positions and coordinates of the marker
            // increase in the X direction to the right and in
            // the Y direction down.
            var image = '/resources/images/grocery.png';
            var markers = new Array(locations.length);
            var infowindows = new Array(locations.length);

            for (var i = 0; i < locations.length; i++) {
                var comercio = locations[i];
                infowindows[i] = new google.maps.InfoWindow({ content: comercio[3] });
                var myLatLng = new google.maps.LatLng(comercio[1], comercio[2]);
                markers[i] = new google.maps.Marker({
                    position: myLatLng,
                    icon: image,
                    map: map,
                    title: comercio[0]
                });
                listenInfoWindows(markers[i], infowindows[i]);
            }
        }


        google.maps.event.addDomListener(window, 'load', initialize);

    </script>
</head>
<body>
<div class="title"> Visualizacion Comercios Programa Asistencia Nutricional </div>
<div id="map-canvas" class="cols"></div>
<div id="list" class="cols">
    <h2 class="mytabletitle">  Municipio de Ubicacion de Comercios:  <c:out value="${municipio}"/></h2>
    <table class="mytable">
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