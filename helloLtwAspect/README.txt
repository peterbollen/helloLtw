Environment
-----------
- Apache Maven 3.0.3 (r1075438; 2011-02-28 18:31:09+0100)
  Maven home: /Users/pbollen/Development/binaries/apache-maven-3.0.3
- Java version: 1.6.0_29, vendor: Apple Inc.
  Java home: /System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home
- Default locale: en_US, platform encoding: MacRoman
- OS name: "mac os x", version: "10.7.2", arch: "x86_64", family: "mac"

Building and Running
--------------------
$ mvn clean install && export MAVEN_OPTS=-javaagent:./src/main/tomcat/lib/aspectjweaver-1.6.11.jar && mvn t7:run

Testing
-------
$ curl http://localhost:8080/helloLtwAspect/echo 
