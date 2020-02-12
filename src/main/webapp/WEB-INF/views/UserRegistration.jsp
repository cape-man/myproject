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
<title>Booking</title>
</head>
<body>
	<form action="/Booking/${sessionScope.roomId}" class = "registrationform" method="post">
		<div class="container" style="background-color: bisque">

			<div class="form-group" style="width: 800px; margin: auto">
				<br> <br>
				<div class="row">
					<div class="col-md-4">
						<div class="well">

							<label for="userName">User Name:</label> <input type="userName"
								class="form-control" id="userName" placeholder="Enter Name"
								name="userName">
						</div>
					</div>
				</div>
			</div>



			<div class="form-group" style="width: 800px; margin: auto">
				<div class="row">
					<div class="col-md-4">
						<div class="well">

							<label for="userPhoneNum">User PhoneNum:</label> <input
								type="userPhoneNum" class="form-control" id="userPhoneNum"
								placeholder="Enter phonenum" name="userPhoneNum">
						</div>
					</div>
				</div>
			</div>


			<div class="form-group" style="width: 800px; margin: auto">
				<div class="row">
					<div class="col-md-4">
						<div class="well">
							<label>Date of Booking</label> <input type="date"
								class="form-control" id="exampleInputDOB1" name="bookingDate"
								placeholder="Date of Booking">
						</div>
					</div>


				</div>

			</div>

			<button type="submit" id="submit" class="btn btn-default">Book
				A Room</button>
		</div>
	</form>

<script type = "text/javascript">
$(document).ready(function(){
	$(".registrationform").validate(
			{
				rules:{
					userName: {
						required : true,
						minlength : 3
					},
			userPhoneNum: {
				required : true,
				maxlength : 9
			},
			bookingDate: {
				required : true,
				
			},
			
			
				}
			
			
	});
	
	
	   
	});

</script>

</body>
</html>