<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <c:if test="${!empty(users)}">
    <table border="1">
      <tr>
        <th> designation </th>
        <td><c:out value="${users.designation}" /></td>
      </tr>
      <tr>
        <th> employeeGroup </th>
        <td><c:out value="${users.employeeGroup}" /></td>
      </tr>
      <tr>
        <th> band </th>
        <td><c:out value="${users.band}" /></td>
      </tr>
      <tr>
        <th> subBand </th>
        <td><c:out value="${users.subBand}" /></td>
      </tr>
      <tr>
        <th> reportingManager </th>
        <td><c:out value="${users.reportingManager}" /></td>
      </tr>
      <tr>
        <th> groupHorizontalBusinessUnit </th>
        <td><c:out value="${users.groupHorizontalBusinessUnit}" /></td>
      </tr>
      <tr>
        <th> horizontalBusinessUnit </th>
        <td><c:out value="${users.horizontalBusinessUnit}" /></td>
      </tr>
      <tr>
        <th> superDeliveryUnit </th>
        <td><c:out value="${users.superDeliveryUnit}" /></td>
      </tr>
      <tr>
        <th> deliveryUnit </th>
        <td><c:out value="${users.deliveryUnit}" /></td>
      </tr>
      <tr>
        <th> personalArea </th>
        <td><c:out value="${users.personalArea}" /></td>
      </tr>
      <tr>
        <th> location </th>
        <td><c:out value="${users.location}" /></td>
      </tr>
      <tr>
        <th> CWL </th>
        <td><c:out value="${users.CWL}" /></td>
      </tr>
    </table>
    </c:if>

</body>
</html>