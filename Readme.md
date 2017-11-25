
# Spring Boot Demo 

**Pre Steps**
* Install latest version of Spring STS : https://spring.io/tools
* Install Postman plugin in Chrome for testing Rest calls
* Configure server.port = 1975 in application.properties

**Invoking the Rest Controller**
* GET   		/employees 			Gets all the employees   http://localhost:1975/employees
* GET    		/employees/id		Get the employee		 http://localhost:1975/employees/1
* POST   		/employees			Create new employee		 http://localhost:1975/employees
* POST   		/employees/id		Update the employee		 http://localhost:1975/employees/
* DELETE		/employees/id		Deletes the employee	 http://localhost:1975/employees/3


**Issues**

Moving the Service Class to package : com.raq.springboot.employee.service
is not working


**Refer for Application properties**

[https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)


