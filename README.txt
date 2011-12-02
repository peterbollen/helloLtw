ENVIRONMENT DETAILS
-------------------
Apache Maven 3.0.3 (r1075438; 2011-02-28 18:31:09+0100)
Maven home: /Users/pbollen/Development/binaries/apache-maven-3.0.3
Java version: 1.6.0_29, vendor: Apple Inc.
Java home: /System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home
Default locale: en_US, platform encoding: MacRoman
OS name: "mac os x", version: "10.7.2", arch: "x86_64", family: "mac"

RUN AND BUILD
-------------
mvn clean install && mkdir -p helloLtwAspect/target/tomcat/lib && cp helloLtwAspect/src/main/tomcat/lib/spring-instrument-tomcat-3.0.5.RELEASE.jar helloLtwAspect/target/tomcat/lib/ && mvn t7:run -f helloLtwAspect/pom.xml
 
visit http://localhost:8080/helloLtwAspect/echo and watch the logs
