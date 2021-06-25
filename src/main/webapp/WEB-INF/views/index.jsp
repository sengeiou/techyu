<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    
  </head>
      
    <script type="text/javascript">
    
    </script>
  <body>
     <table>
       <c:forEach items="${memberList}" var="dto">
           <tr>
               <td>${dto.rnum}</td>
               <td>${dto.uuid}</td>
               <td>${dto.email}</td>
               <td>${dto.password}</td>
               <td>${dto.username}</td>
           </tr>
       </c:forEach>
     </table>
  </body>
</html>