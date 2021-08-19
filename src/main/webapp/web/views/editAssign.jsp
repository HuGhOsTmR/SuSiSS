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
   	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<tr>
		    <td><a href="/toList" class="btn btn-light">Students</a></td>
        	<td><a href="/toListClasses" class="btn btn-light">Classes</a></td>
        	<td><a href="/toListAssigns" class="btn btn-light">Assigns</a></td>
    	</tr>
    </nav>
   		<th>
   		<div class="container mt-4">
   			<form action="/updateAssign" method="POST" class="col-sm-5">
   				<div class="card">
   					<div class="card-header">
   						<h4>Update Assign</h4>
   					</div>
   					<div class="card-body">
   						<div class="form-group">
   							<label>Id</label>
   							<input type="text" name="id" class="form-control" value="${Assign.id}" readonly="readonly">
   						</div>
   						<div class="form-group">
   							<label>Student</label>
   							<input type="text" name="studentID" class="form-control" value="${Assign.studentID}">
   						</div>
   						<div class="form-group">
   							<label>Class</label>
   							<input type="text" name="classID" class="form-control" value="${Assign.classID}">
   						</div>
   						<div class="form-group">
   							<label>State</label>
   							<input type="text" name="assignState" class="form-control" value="${Assign.assignState}">
   						</div>
   					</div>
   					<div class="card-footer">
   						<input type="submit" value="Update" class="btn btn-light">
   						<a href="/toListAssigns" class="btn btn-danger">Cancel</a>   					
   					</div>
   				</div>
   			</form>   			
   		</div>
   		</th>
   		<th>
   		<div class="container mt-8">
	   		
	   				<table class= "table">
		        		<thead>
		        			<tr>
		        				<th>ID</th>
		        				<th>CLASS</th>
		        				<th>STUDENT</th>
		        				<th>STATE</th>
		        				<th>ACTION</th>
		        			</tr>        			
		        		</thead>
		        		<tbody>
		        			<c:forEach var="Assign" items="${Assigns}">
		        				<tr>
			        				<td>${Assign.id}</td>
			        				<td>${Assign.classID}</td>
			        				<td>${Assign.studentID}</td>
			        				<td>${Assign.assignState}</td>
			        				<td>
				        				<a href="/editAssign/${Assign.id}" class="btn btn-light" enabled>Assign Class</a>
				        				<a href="/editAssign/${Assign.id}" class="btn btn-light">Edit</a>
				        				<a href="/deleteAssign/${Assign.id}" class="btn btn-danger">Delete</a>
			        				</td>
			        			</tr>
		        			</c:forEach>
		        			
		        		</tbody>
		        	</table> 			
   		</div>
    </body>
</html>