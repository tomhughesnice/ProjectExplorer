 <%@page import="com.tribal.test.domain.Project"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
 <%
 	List<Project> projectList = (List<Project>) request.getAttribute("projectList");
 %>
 <body>  
 <div>  
   <h1>View all projects</h1>  
   <table border="1" >  
     <tr>  
       <th>Id</th>  
       <th>Name</th>  
       <th>Code</th>  
       <th>Tech Lead</th> 
       <th>Project Manager</th> 
       <th>Delivery Date</th>
       <th>Phase</th>  
       <th>Priority</th>
       <th>Options</th>  
     </tr>  
<%
	for (Project project : projectList) {
%>     
       <tr>  
         <td><%=project.getId()%></td>  
         <td><%=project.getName()%></td>  
         <td><%=project.getCode()%></td>  
         <td><%=project.getTechLead()%></td>
         <td><%=project.getProjectManager()%></td>
         <td><%=project.getDeliveryDate()%></td>
         <td><%=project.getPhase()%></td>
         <td><%=project.getPriority()%></td>
         <td>  
           <a href="view?id=<%=project.getId()%>"> Edit </a>  
         </td>  
       </tr>  
<%
	}
%>
   </table>  
 </div>  
 <a href='view'>Add</a>  
 </body>  
 
 