# Project: Spring Boot Rest Example
---
## Source: Website - https://howtodoinjava.com/spring-boot/spring-boot-rest-api-example/
---
* [How to do it in Java - Spring Boot Rest API Example](https://howtodoinjava.com/spring-boot/spring-boot-rest-api-example/)
* [Datasource Properties](https://howtodoinjava.com/spring-boot2/datasource-configuration/)
* [Github Sourcecode](https://github.com/lokeshgupta1981/Spring-Boot3-Demos/tree/main/rest-api-crud-example)
* [Spring Boot with H2 Database](https://howtodoinjava.com/spring-boot2/h2-database-example/)
* [Spring Boot Request Body and Parameter Example](https://howtodoinjava.com/spring-rest/request-body-parameter-validation/)
* [Next Project: Spring REST CRUD Example with JPA](https://howtodoinjava.com/spring-rest/spring-rest-crud-jpa-example/)
* [How to Dockerize a Spring Boot Application](https://howtodoinjava.com/devops/dockerize-spring-boot-application/)
* [Complete Spring Boot Tutorial](https://howtodoinjava.com/series/spring-boot-tutorial/)

---

* This project is for additional knowledge and practice. It came in the middle of Ramesh Fadatare's 5 Spring Boot Projects in 10 hours course. 
* Observe POM.xml `<parent>` tag - due to this, we do not have to specify versions of any dependency.
* After this example - create an new project based on the link above Spring REST CRUD Example with JPA

---
# Datasource Configuration
```
@Configuration
public class JpaConfig {

    @Bean
    public DataSource dataSource()
    {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:file:C:/temp/test");
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();
    }
}
```