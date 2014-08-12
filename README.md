ProjectExplorer
===============

The applcation should allow a user to create/edit/delete/view projects.

A project has the following information:
	- project name (alphanumeric)
	- project code (alphanumeric)
	- tech lead (person's name)
	- project manager (person's name)
	- delivery date
	- current phase (one of briefing/scoping/interaction/development/qa/release)
	- priority (numerical)
	
The priority field goes from 1 (highest) upwards and is dependant on the number of projects (e.g. only one project is number 1 priority). 
Kind of like a 'top of the pops' list. 

Developer Notes
I was told only to spend 1 hour on the development of this task.Ideally this application should be backed by some kind of datastore to persist information, so save time I just stored everything in memory.

Technologies used
Gradle : Provides an easy to use to toolset to import dependancies and compile a war file. 
Spring MVC : Standard Spring technology stack to model the classic model, view and controller architechture.
Spring Validate : Used to validate the contents of objects.

Deployment instructions
Run gradle build in root directory to download dependancies and assemble WAR file. You can then deploy this war within a Tomcat container. Alternatively I have already deployed this application to an Amazon EC2 instance for testing. Available at the URL http://tribal-env.elasticbeanstalk.com/project/list
