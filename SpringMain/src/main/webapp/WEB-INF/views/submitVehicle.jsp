<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Vehicle Submitted</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	
<style>
body {
	background-color: #F0F8FF;
}
</style>
</head>
<body>
	<h3 class="text-center">Vehicles List</h3>
	<table class="table table-striped table-bordered table-hover">
  <thead class="thead-dark">
    <tr>
      <th scope="col">vehicleNO</th>
      <th scope="col">DriverName</th>
      <th scope="col">Tires</th>
      <th scope="col" colspan="2">Action</th>
      <th scope="col"><a href="detail"><button type="button" class="btn btn-info">AddVehicle</button></th>
    </tr>
  </thead>
		<tbody>
			<c:forEach var="vehicle" items="${vehicle}">
				<tr>
					<td>${vehicle.vehicleNO} </td>
					<td>${vehicle.driverName}</td>
					<td>${vehicle.tires}</td>
					<td><a href="update?vehicleNO=${vehicle.vehicleNO}"><button type="button" class="btn btn-info" >Update</button></td>
					<td> <a href="deletion?vehicleNO=${vehicle.vehicleNO}" onclick="return confirm('Are you sure you want to delete this item');"><button type="button" class="btn btn-danger" >Delete</button></a></td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>


</script>
</html>
