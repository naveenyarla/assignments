# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/#build-image)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides

The following guides illustrate how to use some features concretely:

* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)


The requirements include:
1. Ingesting data from a file in CSV format
2. Searching data using different search criteria
   a. By Zip code or State or City or Type or Bank Name
   b. By City & State
3. Should be able to run the program on command line
4. Include a readme.txt (or readme.md) file that provides instructions to run the
   program, load the data, perform search. Also include your thoughts on how you
   would go about implementing unit and integration tests for the tool you
   developed.

-- To implement this; spring boot is used with thymleaf

1.Download jar in location
2.cd to location where jar has downloaded
3.Run command in cmd: Java -jar ClearingHouse-0.0.1-SNAPSHOT.jar
4. access localhost:8080/ on web client or browser
5. use or / and submits to check the result