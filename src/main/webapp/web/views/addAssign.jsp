<%@ page language='java' contentType='text/html;charset=iso-8859-1'%>
<%@ page import='java.util.Date' %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>  
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">		
        <script src="js/bootstrap.min.js"></script>     
    </head>
    <body>
   		<div class="container mt-4">
   			<form action="/addAssign" method="POST" class="col-sm-5">
   				<div class="card">
   					<div class="card-header">
   						<h4>Add Assign</h4>
   					</div>
   					<div class="card-body">
   						
   						<div class="form-group">
   							<label>Class</label>
   							<input type="text" name="classID" class="form-control">
   						</div>
   						<div class="form-group">
   							<label>Student</label>
   							<input type="text" name="studentID" class="form-control">
   						</div>
   						<div class="form-group">
   							<label>State</label>
   							<input type="text" name="assignState" class="form-control">
   						</div>
   					</div>
   					<div class="card-footer">
   						<input type="submit" value="Save" class="btn btn-link">
   						<a href="/toListAssigns" class="btn btn-link">Back</a>   					
   					</div>
   				</div>
   			</form>
   		</div>
    </body>
</html>