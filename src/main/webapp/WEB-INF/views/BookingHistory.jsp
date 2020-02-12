<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="col-md-6">
		<table class="table table-hover">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Booking ID</th>
					<th scope="col">Booking Date: </th>
					<th scope="col">Room Type: </th>
					<th scope="col">Amount: </th>
				</tr>
			</thead>
			<tbody>
				<tr>

					
						<tr>
							<td>${bookings.bookingId}</td>
							<td>${bookings.bookingDate}</td>
							<td>${bookings.getRoom().getRoomType()}</td>
							<td>${bookings.getRoom().getAmount()}
							


						</tr>
	



		


</tbody>
</table>

<a href = "http://localhost:8086/">Home</a>
</div>


</body>
</html>