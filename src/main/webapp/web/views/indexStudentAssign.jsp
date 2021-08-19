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
		<form action="/updateStudent" method="POST">
		
			<div class="card">
				<div class="card-header">
					<h4>Assign Class to Student</h4>
				</div>
				<div class="row">
					<div class="col-sm-6">
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
					</div>
					<div class="col-sm-6">
						<table class= "table">
				    		<thead>
				    			<tr>
				    				<th>CLASSES ASIGNED</th>
				    			</tr>
				    			<tr>				    				
				    				<th>CODE</th>
				    				<th>TITLE</th>
				    				<th>DESCRIPTION</th>				    				
				    			</tr>        			
				    		</thead>
				    		<tbody>
				    			<c:forEach var="Class" items="${Classes}">
				    				<tr>				        				
				        				<td>${Class.classCode}</td>
				        				<td>${Class.classTitle}</td>
				        				<td>${Class.classDescription}</td>				        				
				    				</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="card-footer">
				<input type="submit" value="Assign" class="btn btn-light">
				<a href="/newClass" class="btn btn-light">Add Classes</a> 
				<a href="/toList" class="btn btn-danger">Cancel</a>					  					
			</div>
		</form>
		<div class="row justify-content-center">
		
		<form class="col-sm-10">
			<div class="table-responsive">
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
	        					<div class="form-check form-switch">
		        				<input type="checkbox" class="form-check-input" name="" value="">
		        				</div>
	       					</td>
	    				</tr>
					</c:forEach>
				</tbody>
			</table>
			</div>
		</form>
		</div>
    </body>
</html>