<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Vehicle Form</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<style>
		body {
			background-color:#7591aa;
		}
	</style>
</head>
<body>
	<div class="container">
		<h2 style="justify-content: center;">Enter Vehicle Information</h2>
		<form:form method="POST" modelAttribute="vehicle" action="updated">
			<div class="form-group">
				<label for="vehicleNO">Vehicle No:</label>
				<form:input path="vehicleNO" readonly="true" class="form-control"/><form:errors  path="vehicleNO" cssStyle="color:red;" /></td>
			</div>
			<div class="form-group">
				<label for="tires">Tires:</label>
				<form:input path="tires"  class="form-control"/>
			</div>
			<div class="form-group">
				<label for="driverName">Driver Name:</label>
				<form:input path="driverName"  class="form-control"/><form:errors  path="driverName" cssStyle="color:red;" /></td>
			</div>
			<div class="form-group">
				<input type="submit" value="Submit" class="btn btn-primary"/>
			</div>
		</form:form>
	</div>
</body>
</html>

