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
    </div>
        <div class="container mt-4">
        <a href="/newStudent" class="btn btn-danger">Add Student</a>
        	<table class= "table">
        		<thead>
        			<tr>
        				<th>ID</th>
        				<th>CODE</th>
        				<th>LAST NAME</th>
        				<th>FIRST NAME</th>
        				<th>ACTION</th>
        			</tr>        			
        		</thead>
        		<tbody>
        			<c:forEach var="student" items="${students}">
        				<tr>
	        				<td>${student.id}</td>
	        				<td>${student.studentID}</td>
	        				<td>${student.studentLastName}</td>
	        				<td>${student.studentFirstName}</td>
	        				<td>
		        				<a href="/newAssignClasses/${student.id}" class="btn btn-light">Assign Class</a>
		        				<a href="/editStudent/${student.id}" class="btn btn-light">Edit</a>
		        				<a href="/deleteStudent/${student.id}" class="btn btn-danger">Delete</a>
	        				</td>
	        			</tr>
        			</c:forEach>        			
        		</tbody>
        	</table>
        </div>
    </body>
</html>