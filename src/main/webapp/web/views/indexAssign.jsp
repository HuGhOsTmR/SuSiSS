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
        <a href="/newAssign" class="btn btn-light">Add Assign</a>
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
        			<c:forEach var="assign" items="${Assigns}">
        				<tr>
	        				<td>${assign.id}</td>
	        				<td>${assign.classID}</td>
	        				<td>${assign.studentID}</td>
	        				<td>${assign.assignState}</td>
	        				<td>
		        				<a href="/editAssign/${assign.id}" class="btn btn-success" enabled>Assign Class</a>
		        				<a href="/editAssign/${assign.id}" class="btn btn-dark">Edit</a>
		        				<a href="/deleteAssign/${assign.id}" class="btn btn-danger">Delete</a>
	        				</td>
	        			</tr>
        			</c:forEach>
        			
        		</tbody>
        	</table>
        	<tr>
	        	<td><a href="/toList" class="btn btn-primary">Students</a></td>
	        	<td><a href="/toListClasses" class="btn btn-primary">Classes</a></td>
	        	<td><a href="/toListAssigns" class="btn btn-primary">Assigns</a></td>
        	</tr> 
        </div>
    </body>
</html>