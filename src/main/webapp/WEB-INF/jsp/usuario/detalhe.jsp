<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
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

			<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
			  <a class="navbar-brand" href="/sair">Logout</a>
			</nav>	

			<form action="/usuario/incluir" method="post">
			
			  <div class="form-group">
			    <label for="usr">Nome:</label>
			    <input type="text" class="form-control" name="nome" required>
			  </div>
			
			  <div class="form-group">
			    <label for="usr">Login:</label>
			    <input type="text" class="form-control" name="login" required>
			  </div>
			
			  <div class="form-group">
			    <label for="usr">Senha:</label>
			    <input type="password" class="form-control" name="senha" required>
			  </div>
			
			  <button type="submit" class="btn btn-primary">Salvar</button>
			</form>
  		</div>
	</div>

</body>
</html>