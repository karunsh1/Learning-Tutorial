<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	<h3>
		Congratulation!! the engineering college has prcess your application
		form successfully
		</h1>

		<%-- <h2>${msg1}</h2> --%>
		<h2>Detail submitted by you ::</h2>
		<table>
			<tr>
				<td>Student Name :
				</th>
				<td>${student1.studentName}
				</th>
			</tr>
			<tr>
				<td>Student Hobby</td>
				<td>${student1.studentHobby}</td>
			</tr>

			<tr>
				<td>Student Mobile</td>
				<td>${student1.studentMobile}</td>
			</tr>
			<tr>
				<td>Student DOB</td>
				<td>${student1.studentDOB}</td>
			</tr>
			<tr>
				<td>Student studentSkills</td>
				<td>${student1.studentSkills}</td>
			</tr>
			<td>Student's Address</td>
			<td>country : ${student1.studentAddress.country } city :
				${student1.studentAddress.city } street :
				${student1.studentAddress.street } pincode :
				${student1.studentAddress.pincode }</td>
		</table>
</body>
</html>