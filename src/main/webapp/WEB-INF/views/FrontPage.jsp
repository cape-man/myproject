<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/resources/css/style.css">
<script type = "text/javascript" src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.1/dist/jquery.validate.min.js" ></script>
<meta charset="ISO-8859-1">
<title>My Stay Application</title>
</head>
<body>

	<form action="/Rooms/roomType" method="GET" class = "signinform">
		<div class="navbar-wrapper">
			<div class="container">

				<nav class="navbar navbar-inverse navbar-static-top">
					<div class="container">
						<div class="navbar-header">
							<div class="navbar-brand">Room Booking</div>

						</div>
						<div id="navbar" class="navbar-collapse collapse">
							<ul class="nav navbar-nav">

								<li><a href="/Rooms/luxury" name="roomType" value="luxury">Luxury</a></li>
								<li><a href="/Rooms/semi-luxury" name="roomType"
									value="semi-luxury">Semi-Luxury</a></li>
								<li><a href="/Rooms/budget" name="roomType" value="budget">Budget</a></li>

							</ul>


						</div>
					</div>
				</nav>

			</div>
		</div>

		<div id="heading" class="text-center">
			<h1>My Stay Application</h1>
		</div>

	</form>

<div class="container">
  <img src="${pageContext.request.contextPath}/resources/images/image1.png"" alt="Norway" style="width:100%;">
  <div class="text-block">
   
  </div>
</div>












</body>
</html>