 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
 <body>  
   <div id="container">
		<div class="message">Edit Project settings</div>
		<spring:bind path="phaseList"/>
		<form:form method="POST" modelAttribute="project">
			<form:hidden path="id" />	
			<div class="formRow">
				<div>
					<form:label path="name">Name</form:label>
					<form:input path="name"/>	
					<form:errors path="name" cssclass="error"></form:errors>
				</div>
				<div>
					<form:label path="code">Code</form:label>
					<form:input path="code"/>	
					<form:errors path="code" cssclass="error"></form:errors>
				</div>
				<div>
					<form:label path="techLead">Tech lead</form:label>
					<form:input path="techLead"/>	
					<form:errors path="techLead" cssclass="error"></form:errors>
				</div>
				<div>
					<form:label path="projectManager">Project Manager</form:label>
					<form:input path="projectManager"/>	
					<form:errors path="projectManager" cssclass="error"></form:errors>
				</div>
				<div>
					<form:label path="deliveryDate">Delivery Date</form:label>
					<form:input path="deliveryDate" placeholder="MM/DD/YYYY"/>	
					<form:errors path="deliveryDate" cssclass="error"></form:errors>
				</div>
				<div>
					<form:label path="phase">Phase</form:label>
					<form:select path="phase">
						<form:option value="BRIEFING" label="BRIEFING"/>
						<form:option value="SCOPING" label="SCOPING"/>
						<form:option value="INTERACTION" label="INTERACTION"/>
						<form:option value="DEVELOPMENT" label="DEVELOPMENT"/>
						<form:option value="QA" label="QA"/>
						<form:option value="RELEASE" label="RELEASE"/>
					</form:select>	
					<form:errors path="phase" cssclass="error"></form:errors>
				</div>
				<div>
					<form:label path="priority">Priority</form:label>
					<form:input path="priority"/>	
					<form:errors path="priority" cssclass="error"></form:errors>
				</div>
			</div>
			<input type="submit" value="Save" />
		</form:form>
	</div> 
 </body>  
 
