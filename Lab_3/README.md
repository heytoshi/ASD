1. What is Spring?
Spring is a framework and IoC container for building enterprise Java apps.

Example: Simplifies configuration for apps and provides dependency injection.

2. What is Spring Boot?
Spring Boot is a framework based on Spring that makes using Spring even easier. It makes setup and configuration easier.

Example: Create apps quickly using Spring Initializr.

3. What is the relation between Spring platform and Spring Boot?
The Spring Platform includes the entire Spring ecosystem, while Spring Boot simplifies development with defaults and auto-configurations.

Example: When creating a web application with Spring Platform, Spring Framework is used for core features, and Spring Boot is utilized for quick setup and configuration.

4. What is the relation between Spring platform and Spring framework?
The Spring Framework is the core component of the Spring Platform and the Spring platform is the bigger ecosystem which includes Spring framework

Example: Creating a RESTful API with Spring Platform requires managing HTTP requests and creating REST endpoints using the Spring Framework.

5. What is Dependency Injection and how is it done in the Spring platform/framework?
Dependency Injection (DI) is main functionality of Spring IOC and responsible for injecting dependencies.
1.define bean
2. declare dependency
3. configure beans
4. let IoC container handle dependency injection

Example: Annotate a service class with @Service and inject a dependency using @Autowired

6. What is Inversion of Control (IoC) and how is it related to Spring?
IoC mean that the flow of control is controlled by a framework and Spring IoC container is the core of Spring framework. The container manages objects, their dependencies and their lifecycles.

Example: The IoC container takes care of the injection at runtime when you configure a data source bean and inject it into a repository bean.

![alt text](https://raw.githubusercontent.com/heytoshi/ASD/main/Lab_3/screenshots/diagram.png
?raw=true)


 


