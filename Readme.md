### Exception vs performance in Java
Whenever we throw exception, there is a stacktrace which gets generated. This takes performance impact. 
The performance impact can be measured using JMH :  Java Micro-bench Harness:  https://github.com/openjdk/jmh  

Compile code using : 
```
mvn clean install
```

Run the code using: 
```
java -jar target\benchmark.jar
```
The above command will give the performance impact of the methods of MyBenchMark.java
```
jcmd /// gives the process id of java process
jstack -l <process_id_from_previous_line> | pbcopy
```

IntelliJ => Code => Analyze thread dump
The observation is that, for a developer who is investigating a genuine issue in prod can get confused because of the stacktrace shown here. 