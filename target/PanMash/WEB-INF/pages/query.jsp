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
    <title>BUSQUEDA DE COMERCIOS CERTIFICADOS PAN</title>
    <style type="text/css">

            /* CSS rules used in the examples */
        body {
            font: normal 11px auto "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
            color: #4f6b72;
            background: #cdd1d0;
            margin: auto;
            height: auto;
        }

        form {
            width:300px;
        }
        form.style1 fieldset {
            padding: 1em;
            font:80%/1 sans-serif;
            margin: auto;
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
            border:1px solid black;
            margin:auto;
        }
        form.style2 legend {
            padding: 0.2em 0.5em;
            border:1px solid black;
            color:black;
            font-size:90%;
            text-align:right;
        }

            /* other page CSS */
        h4 { margin-top:2em }
        input { font-size:100%; vertical-align:middle; text-align: left; padding: 2px;  }
        .top {
            height: 50px;
            padding-top: 10px;
            background:  black;
            color: white;

        }

        .fset {
            width: 300px;
        }
    </style>
</head>
<body>
<div class="top"><h2>VISUALIZACION PROGRAMA ASISTENCIA NUTRICIONAL</h2></div>
<h2>Seleccione Parametros de Busqueda:</h2>
<form:form modelAttribute="formBean" action="query" method="post">
    <div class="fset">
    <fieldset>
        <form:label path="status">Estatus de Comercio:</form:label>
        <form:select path="status">
          <form:options items="${statuses}"/>
        </form:select>
        <br/>
        <form:label path="estName">Comercio:</form:label>
        <form:input path="estName" />
        <br/>
        <form:label path="Municipality">Municipio:</form:label>
        <form:select path="Municipality">
            <form:options items="${municipalities}"/>
        </form:select>
        <br/>
        <br/>
        <input type="submit" value="Buscar"/>
    </fieldset>
    </div>
</form:form>
</body>
</html>