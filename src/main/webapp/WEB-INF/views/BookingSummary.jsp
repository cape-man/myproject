<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action = "/BookingSummary/${sessionScope.roomId}">

<div class="jumbotron text-center">
  <h1 class="display-3">Booking Succesfull !!</h1>
  
  <hr>
  <p>
   Booking Summary <a href="/BookingSummary/${sessionScope.roomId}">Booking Summary</a>
   <br>
   <br>
   <br>
  </p>
  <p class="lead">
    <a class="btn btn-primary btn-sm" href="http://localhost:8086/"role="button">Continue to homepage</a>
  </p>
</div>




</form>
</body>
</html>