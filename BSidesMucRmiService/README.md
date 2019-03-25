
A minimal RMI service (client and server) to demonstrate attack possibilities of Java RMI services. It includes a dependency to Apache CommonsCollections3, allowing the exploitation via insecure Java deserialization.


## Compilation
This is a Maven repository, you can build a working JAR with the following command:

```
mvn clean compile assembly:single
```


## Server
The default main method will start the RMI server with the RMI registry on port 1099

```
java -jar BSidesRMIService-0.1-jar-with-dependencies.jar 
```

## Client
The client can be started as follows. You need to provide the IP address of the server as command line argument 
```
java -cp BSidesRMIService-0.1-jar-with-dependencies.jar de.mogwailabs.BSidesRMIService.BSidesClient 127.0.0.1
Calling bsides.register()
Calling bsides.visitTalk()
```

If everything works as expected you can see the incoming calls on the server:
```
register called: 123456
visitTalk called: Exploiting Java RMI services
``` 

