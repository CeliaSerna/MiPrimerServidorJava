<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Mi primer Servlet</title>
</head>
<body>
<h1>Formulario de alta</h1>
<form name="formulario1" action="Controller" method="get">

	<label for="nombre">Nombre:</label>
	<input type="text" id="nombre" name="nombre">
	<br>
	<label for="apellidos">Apellidos:</label>
	<input type="text" id="apellidos" name="apellidos">
	<br>
	<input type="submit" value="Enviar">

</form>


</body>
</html>