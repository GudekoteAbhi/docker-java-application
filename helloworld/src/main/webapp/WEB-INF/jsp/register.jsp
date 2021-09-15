<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee registration form</title>
</head>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>
<body>
 <div class="container">
  <h1>Employee Register Form</h1>
  <form:form method="post" action="/registeruser" modelAttribute="newuser">
   <table style="with: 80%">
    <tr>
     <td>First Name</td>
     <td><form:input path="firstName" type="text" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><form:input path="lastName" type="text" /></td>
    </tr>
    <tr>
     <td>UserName</td>
     <td><form:input path="username" type="text"  /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><form:input path="password" type="password" /></td>
    </tr>
    <tr>
     <td>Address</td>
     <td><form:input path="address" type="text" /></td>
    </tr>
    <tr>
     <td>Contact No</td>
     <td><form:input path="contact" type="text" /></td>
    </tr>
   </table>
   <button type="submit" value="Submit" id="submit">submit</button>
  </form:form>
 </div>
</body>
</html>