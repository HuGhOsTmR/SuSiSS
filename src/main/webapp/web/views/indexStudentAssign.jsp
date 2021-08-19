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
    <div class="container mt-4">
   			<form action="/updateStudent" method="POST" class="col-sm-5">
   				<div class="card">
   					<div class="card-header">
   						<h4>Assign Class to Student</h4>
   					</div>
   					<div class="card-body">
   						<div class="form-group">
   							<label>Id</label>
   							<input type="text" name="id" class="form-control" value="${student.id}" readonly="readonly">
   						</div>
   						<div class="form-group">
   							<label>Code</label>
   							<input type="text" name="studentID" class="form-control" value="${student.studentID}" readonly="readonly">
   						</div>
   						<div class="form-group">
   							<label>Last Name</label>
   							<input type="text" name="studentLastName" class="form-control" value="${student.studentLastName}" readonly="readonly">
   						</div>
   						<div class="form-group">
   							<label>First Name</label>
   							<input type="text" name="studentFirstName" class="form-control" value="${student.studentFirstName}" readonly="readonly">
   						</div>
   					</div>
   					<div class="card-footer">
   						<input type="submit" value="Update" class="btn btn-light">
   						<a href="/toList" class="btn btn-danger">Cancel</a>   					
   					</div>
   				</div>
   			</form>
   	</div>
    <div class="container mt-4">
        <a href="/newClass" class="btn btn-light">Add Class</a>
        	<table class= "table">
        		<thead>
        			<tr>
        				<th>ID</th>
        				<th>CODE</th>
        				<th>TITLE</th>
        				<th>DESCRIPTION</th>
        				<th>ACTION</th>
        			</tr>        			
        		</thead>
        		<tbody>
        			<c:forEach var="Class" items="${Classes}">
        				<tr>
	        				<td>${Class.id}</td>
	        				<td>${Class.classCode}</td>
	        				<td>${Class.classTitle}</td>
	        				<td>${Class.classDescription}</td>
	        				<td>
		        				<a href="/toListAssigns" class="btn btn-light">Student List</a>
		        				<a href="/editClass/${Class.id}" class="btn btn-dark">Edit</a>
		        				<a href="/deleteClass/${Class.id}" class="btn btn-danger">Delete</a>
	        				</td>
	        			</tr>
        			</c:forEach>
        		</tbody>
        	</table>
    </div> 	
    </body>
</html>