<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
  <title>App Guia de Aves</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">

		<div class="container-fluid" style="margin-top:80px">		
			<c:import url="/WEB-INF/jsp/header.jsp"/>
		</div>			
	
		<h3>Áudio: ${operacao}</h3>
	
		<form action="/audio/incluir" method="post">
			<input type="hidden" name="id" value="${audio.id}">

		    <div class="form-group">
		      <label for="usr">Nome:</label>
		      <input type="text" class="form-control" name="nome" value="${audio.ave.nome}" required>
		      <label for="usr">Espécie:</label>
		      <input type="text" class="form-control" name="nome" value="${audio.ave.especie}" required>
		      <label for="usr">Ameaçada:</label>
		      <input type="radio" name="ameacada" value="${audio.ave.ameacada}" required>Sim
		      <input type="radio" name="ameacada" value="${audio.ave.ameacada}" required>Não		      
		    </div>

	    	<button type="submit" class="btn btn-primary">Salvar</button>
	  	</form>
	</div>
</body>
</html>