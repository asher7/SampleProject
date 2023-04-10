<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    <form:form method="GET" action="submitVehicle" > 
        <h2>Vehicle Information Inserted</h2>
        <div class="form-group">
				<input type="submit" value="Get Vehicles" class="btn btn-primary"/>
			</div>
        </form:form>
    </body>
</html>
