 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
 <body>  
 <div>  
   <h1>View all projects</h1>  
   <table class="gradient">  
     <tr>  
       <th>Id</th>  
       <th>Name</th>  
       <th>Options</th>  
     </tr>  
     <c:forEach items="${projectList}" var="project">  
       <tr>  
         <td>${project.id}</td>  
         <td>${person.name}</td>  
         <td>  
           <a href="view?id=${project.id}"> Edit </a>  
         </td>  
       </tr>  
     </c:forEach>  
   </table>  
 </div>  
 <a href='view'>Add</a>  
 </body>  