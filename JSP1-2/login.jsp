<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<form class="form-control mt-4" action="LoginServlet" method="POST">
				<div
					class=" d-flex justify-content-center bg-primary text-light font-weight-bold ">
					Login Form</div>
				<br />

				<div class="form-group">
					<input type="text" name="username" id="usernameId"
						class="form-control" placeholder="Enter Username">
				</div>
				<div class="form-group">
					<input type="password" name="password" id="passwordId"
						class="form-control" placeholder="Enter Password">
				</div>
				<div class="form-group d-flex justify-content-center">
					<button type="submit" class=" btn btn-md btn-outline-success">
						Submit</button>
				</div>
			</form>
		</div>
		<br />
		<div class="row d-flex justify-content-center">

			<%
			String message =(String) request.getAttribute("message");
			if (message != null) {
				out.println(message);
			}
			%>
		</div>
	</div>
</body>
</html>