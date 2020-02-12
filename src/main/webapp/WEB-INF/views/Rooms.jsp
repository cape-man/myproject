<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<meta charset="ISO-8859-1">
</head>
<body>
	
<form action = "UserRegistration/roomId">

<div class="col-md-6">
		<table class="table table-hover">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Room ID</th>
					<th scope="col">Room Type</th>
					<th scope="col">Room Amount</th>
					<th scope="col">Hotel Name</th>
				</tr>
			</thead>
			<tbody>
				<tr>

					<c:forEach var="rooms" items="${rooms}">
						<tr>
							<td>${rooms.roomId}</td>
							<td>${rooms.roomType}</td>
							<td>${rooms.amount}</td>
							<td>${rooms.getHotel().getHotelName()}
							<td><a href="UserRegistration/${rooms.roomId}">Select</a></td>


						</tr>
					</c:forEach>



				</tr>


</tbody>
</table>
</div>

	</form>

</body>
</html>