<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel=stylesheet href="css/style.css" type="text/css">
</head>
<body>
	<div id="main">
		<header>
			<h1>CRUD USING MYSQL, JAVA AND SOME POKEMON</h1>
			<br>
			<h2>Simple project using JSP pages, Servlets and a DB in MySQL v1.0</h2>
			<br>
			<p>You can do CREATE, READ, UPDATE and DELETE operations here</p>
		</header>
		<nav id="navegacion">
			<ul id="menu">
				<li><a href="Create.jsp">CREATE</a></li>
				<li><a href="#">READ</a>
					<ul id="submenu">
						<li><a href="Read.jsp">Read One Register</a></li>
						<li><a href="ReadAll.jsp">Read All The Table</a></li>
					</ul>
				</li>
				<li><a href="Update.jsp">UPDATE</a></li>
				<li><a href="Delete.jsp">DELETE</a></li>
			</ul>
		</nav>
		<section id="viewer">
			<br>
			<form action="ReadGServlet" method="post" id="miForm">
				<p>
					<label for="txtReadA"> READ ALL THE REGISTERS </label>
					<input type="submit" value="Read all the table">
				</p>
			</form>
		</section>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script src="scripts/script.js" type="text/javascript"></script>

</body>
</html>