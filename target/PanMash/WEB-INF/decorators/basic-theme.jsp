<?xml version="1.0" encoding="UTF-8" ?>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%--bootstrap.js enable responsive--%>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title><decorator:title default="PAN"/></title>

    <%-- JavaScript libraries --%>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>

    <%-- CSS Stylesheets --%>
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet">
    <style type="text/css">
            /* Customize the navbar links to be fill the entire space of the .navbar */
        .navbar .navbar-inner {
            padding: 0;
        }
        .navbar .nav {
            margin: 0;
            display: table;
            width: 100%;
        }
        .navbar .nav li {
            display: table-cell;
            width: 1%;
            float: none;
        }
        .navbar .nav li a {
            font-weight: bold;
            text-align: center;
            border-left: 1px solid rgba(255,255,255,.75);
            border-right: 1px solid rgba(0,0,0,.1);
        }
        .navbar .nav li:first-child a {
            border-left: 0;
            border-radius: 3px 0 0 3px;
        }
        .navbar .nav li:last-child a {
            border-right: 0;
            border-radius: 0 3px 3px 0;
        }
    </style>

</head>
<body>
    <div class="container">
        <div class="masthead">
            <h3 class="muted">Comercios PAN</h3>
            <%--<div class="navbar">
                <div class="navbar-inner">
                    <div class="container">
                        <ul class="nav">
                            <li><a href="${pageContext.request.contextPath}">Menu1</a></li>
                            <li><a href="${pageContext.request.contextPath}">Menu2</a></li>
                        </ul>
                    </div>
                </div>
            </div><!-- /.navbar -->--%>
        </div>
        <div id="content">
            <decorator:body />
        </div>
    </div>
</body>
</html>