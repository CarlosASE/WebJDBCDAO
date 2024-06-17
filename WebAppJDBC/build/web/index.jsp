<%-- 
    Document   : index
    Created on : 14 jun 2024, 17:45:15
    Author     : carlos
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="mrysi.beans.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gestión de Entidades</title>
</head>
<body>
    <h1>Insertar Nueva Entidad</h1>
    <form action="InsertEntidad" method="post">
        <label for="id">ID:</label>
        <input type="text" id="id" name="id">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre">
        <input type="submit" value="Insertar">
    </form>
</body>
</html>
