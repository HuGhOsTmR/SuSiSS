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
   			<form action="/updateClass" method="POST" class="col-sm-5">
   				<div class="card">
   					<div class="card-header">
   						<h4>Update Class</h4>
   					</div>
   					<div class="card-body">
   						<div class="form-group">
   							<label>Id</label>
   							<input type="text" name="id" class="form-control" value="${Class.id}" readonly="readonly">
   						</div>
   						<div class="form-group">
   							<label>Code</label>
   							<input type="text" name="classCode" class="form-control" value="${Class.classCode}">
   						</div>
   						<div class="form-group">
   							<label>Title</label>
   							<input type="text" name="classTitle" class="form-control" value="${Class.classTitle}>
   						</div>
   						<div class="form-group">
   							<label>Description</label>
   							<input type="text" name="classDescription" class="form-control" value="${Class.classDescription}>
   						</div>
   					</div>
   					<div class="card-footer">
   						<input type="submit" value="Update" class="btn btn-light">
   						<a href="/toListClasses" class="btn btn-danger">Cancel</a>   					
   					</div>
   				</div>
   			</form>
   		</div>
    </body>
</html>