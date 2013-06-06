<%--
  Created by IntelliJ IDEA.
  User: jhernandez
  Date: 6/5/13
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<!-- Use this for the 'form' tag   -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Comercios PAN</title>
    <style type="text/css">

            /* CSS rules used in the examples */
        body {
            font: normal 11px auto "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
            width: 300px;
            margin: 2em;
            color: #4f6b72;
            background: #E6EAE9;
        }
        form.style1 fieldset {
            padding: 1em;
            font:80%/1 sans-serif;
            width:250px;
        }
        form.style1 label {
            float:left;
            width:25%;
            margin-right:0.5em;
            padding-top:0.2em;
            text-align:right;
            font-weight:bold;
        }

        form.style2 fieldset {
            border:1px solid green;
            width: 250px;
        }
        form.style2 legend {
            padding: 0.2em 0.5em;
            border:1px solid green;
            color:green;
            font-size:90%;
            text-align:right;
        }

            /* other page CSS */
        h4 { margin-top:2em }
        input { font-size:100%; vertical-align:middle; text-align: left; padding: 2px;  }

    </style>
</head>
<body>
<h4>Seleccione Parametros de Busqueda:</h4>
<form:form modelAttribute="formBean" action="query" method="post">
    <fieldset>
        <form:label path="status">Status:</form:label>
        <form:select path="status">
          <form:options items="${statuses}"/>
        </form:select>
        <br/>
        <form:label path="estName">Store:</form:label>
        <form:input path="estName" />
        <br/>
        <form:label path="Municipality">Municipality:</form:label>
        <form:select path="Municipality">
            <form:options items="${municipalities}"/>
        </form:select>
        <br/>
        <br/>
        <input type="submit" value="Buscar"/>
    </fieldset>
</form:form>
</body>
</html>