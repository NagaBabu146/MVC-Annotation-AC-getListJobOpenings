<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

   <%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>

<c:choose>
    <c:when test="${!empty result }">
         <table border="1">
             <tr bgcolor="Aquamarine"><th>jobId</th> <th>company</th> <th>salaryRange</th><th>openings</th><th>role</th> <th>location</tr>
             <c:forEach var="dto"  items="${result}">
                  <tr bgcolor="AliceBlue">
                     <td>${dto.jobId}</td>
                     <td>${dto.company}</td>
                     <td>${dto.salaryRange}</td>
                     <td>${dto.openings}</td>
                     <td>${dto.role}</td>
                     <td>${dto.location}</td>
                  </tr>
             </c:forEach>
         </table>
    </c:when>
    <c:otherwise>
              <h1 style="color:red;text-align:center">Records not found </h1>
    </c:otherwise>
</c:choose>

 <br><br>
   <a href="home.htm">home</a>   