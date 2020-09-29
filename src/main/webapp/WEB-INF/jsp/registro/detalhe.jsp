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
	
		<c:if test="${not empty msgError}">
			<div class="alert alert-danger">
			  <strong>Ops!!</strong> ${msgError}
			</div>		
		</c:if>

		<h3>Registros: ${operacao}</h3>
	
		<form action="/registro/incluir" method="post">
		
		    <div class="form-group">
		      <label for="usr">Observador:</label>
		      <select class="form-control" name="observador.id">
		      	<c:forEach var="obs" items="${observadores}">
					<option value="${obs.id}">${obs.nome}</option>
				</c:forEach>
		      </select>
		    </div>
		
		    <div class="form-group">
		      <label for="usr">Local:</label>
		      <input type="text" class="form-control" name="local" required>
		    </div>
	
			<div class="form-group">
				<label for="usr">Aves:</label>
				<c:if test="${not empty aves}">
					<div class="form-check">
						<label class="form-check-label">
							<c:forEach var="ave" items="${aves}">
								<input type="checkbox" class="form-check-input" name="produtosIds" value="${ave.id}"> ${ave.local}<br>
							</c:forEach>
						</label>
					</div>
				</c:if>
				<c:if test="${empty aves}">
				<label for="usr">Nenhuma ave cadastrada!</label>
				</c:if>
			</div>
	
		<c:if test="${empty aves || empty observadores}">
			<c:set var="disabled" value="disabled"/>
		</c:if>
		
	
	    <button ${disabled} type="submit" class="btn btn-primary">Salvar</button>
	  </form>
	</div>
</body>
</html>