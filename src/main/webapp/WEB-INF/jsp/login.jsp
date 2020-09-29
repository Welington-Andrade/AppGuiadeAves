<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		   
		<h1>Projeto App Guia de Aves</h1>
		<p>Sistema para repositório de registros de observação de aves</p>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-warning">
				<strong>Algo deu errado!</strong> ${mensagem}
			</div>
		</c:if>
		<form action="login" class="was-validated" method="post">
			<div class="form-group">
				<label for="uname">Login:</label> <input type="text"
					class="form-control" placeholder="Entre com o login"
					name="username" required>
				<div class="valid-feedback">ok</div>
				<div class="invalid-feedback">Por favor, preencha o login!</div>
			</div>
			<div class="form-group">
				<label for="pwd">Senha:</label> <input type="password"
					class="form-control" placeholder="Entre com a senha"
					name="password" required>
				<div class="valid-feedback">ok</div>
				<div class="invalid-feedback">Por favor, digite a senha!</div>
			</div>

			<button type="submit" class="btn btn-primary">Entrar</button>
		</form>

		<div class="d-flex justify-content-center align-items-center mt-4">
			<span class="font-weight-normal"> Não tem cadastro? <a
				href="/user" class="font-weight-bold">Fazer cadastro!</a>
			</span>
		</div>
	</div>
</body>
</html>