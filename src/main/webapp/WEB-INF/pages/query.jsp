<%--
  Created by IntelliJ IDEA.
  User: jhernandez
  Date: 6/5/13
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<!-- Use this for the 'form' tag   -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Comercios PAN</title>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="masthead">
            <h3 class="muted">Comercios PAN</h3>
        </div>
        <h4 style="text-align: center">Seleccione Parametros de Busqueda</h4>
        <form:form modelAttribute="formBean" action="query" method="post" cssStyle="text-align: center">
            <fieldset>
                <form:label path="status">Status</form:label>
                <form:select path="status">
                  <form:options items="${statuses}"/>
                </form:select>
                <br/>
                <form:label path="estName">Store</form:label>
                <form:input path="estName" />
                <br/>
                <form:label path="Municipality">Municipality</form:label>
                <form:select path="Municipality">
                    <form:options items="${municipalities}"/>
                </form:select>
                <br/>
                <br/>
                <input type="submit" value="Buscar"/>
            </fieldset>
        </form:form>
    </div>
</body>
</html>