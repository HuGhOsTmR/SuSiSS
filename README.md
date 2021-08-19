# SuSiSS
Super Simple Scheduling System
Technical details:
The application was created for assigning students to classes.
Relationship Type: Many to many.
DB manager: H2
Framework: Spring Framework - Spring Tool Suite 4
JSTL - JSP
Bootstrap

Models:

Student:
ID
studentID
studentLastName
studentFirstName

Class:
ID
code
title
description

Assignment (Relational Table):
ID
classID
studentID
assignState

Default port for test environment: 8080
