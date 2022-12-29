### Exception vs performance in Java
Whenever we throw exception, there is a stacktrace which gets generated. This takes performance impact. 
<br>
The performance impact can be measured using JMH :  Java Micro-bench Harness:  https://github.com/openjdk/jmh  
<br>
create a new project in IntelliJ with following config:
<br>File => new project
<br>choose maven archetype: org.openjdk.jmh:jmh-java-benchmark-archetype

#### Compile code using : 
```
mvn clean install
```

#### PERFORMANCE: 
```
java -jar target\benchmark.jar
```
The above command will give the performance impact of the methods of MyBenchMark.java

#### DEBUG-ABILITY 
```
jcmd /// gives the process id of java process
jstack -l <process_id_from_previous_line> | pbcopy
```
IntelliJ => Code => Analyze thread dump
The observation is that, for a developer who is investigating a genuine issue in prod can get confused because of the stacktrace shown here. 