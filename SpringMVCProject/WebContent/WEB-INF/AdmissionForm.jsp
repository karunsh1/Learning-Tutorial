<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<link rel="stylesheet" href="<spring:theme code='styleSheet' />"
		type="text/css" />
	<p>
		<a href="/SpringMVCProject/admissionForm.html?siteTheme=green">Green</a>
		| <a href="/SpringMVCProject/admissionForm.html?siteTheme=red">Red</a>
	</p>


	<a href="/SpringMVCProject/admissionForm.html?siteLanguage=en">English</a>
	|
	<a href="/SpringMVCProject/admissionForm.html?siteLanguage=fr">French</a>
	<h1>${headerMessage}</h1>
	<h3>
		<spring:message code="lable.admissionForm" />
	</h3>

	<form:errors path="student1.*" />
	<form action="/SpringMVCProject/submitAdmissionForm.html" method="post">

		<table>
			<tr>
				<td><spring:message code="lable.studentName" /></td>
				<td><input type="text" name="studentName" /></td>
			</tr>
			<tr>
				<td><spring:message code="lable.studentHobby" /></td>
				<td><input type="text" name="studentHobby" /></td>
			</tr>
			<tr>
				<td><spring:message code="lable.studentMobile" /></td>
				<td><input type="text" name="studentMobile" /></td>
			</tr>
			<tr>
				<td><spring:message code="lable.studentDOB" /></td>
				<td><input type="text" name="StudentDOB" /></td>
			</tr>
			<tr>
				<td><spring:message code="lable.studentSkills" /></td>
				<td><select name="studentSkills" multiple="multiple">
						<option value="Java Core">Java Core</option>
						<option value="Spring Core">Spring Core</option>
						<option value="Spring MVC">Spring MVC</option>
				</select></td>
			</tr>

			<tr>
				<td><spring:message code="lable.studentAddress" /></td>
			</tr>
			<tr>
				<td><spring:message code="lable.country" /><input type="text"
					name=studentAddress.country /></td>
				<td><spring:message code="lable.city" /> <input type="text"
					name=studentAddress.city /></td>
				<td><spring:message code="lable.street" /> <input type="text"
					name=studentAddress.street /></td>
				<td><spring:message code="lable.pinCode" /> <input type="text"
					name=studentAddress.pincode /></td>

			</tr>
			<tr>
				<td><input type="submit"
					value=<spring:message code="lable.submit.admissionForm"/> /></td>
			</tr>

		</table>
	</form>
</body>
</html>