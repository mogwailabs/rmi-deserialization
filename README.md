# Attacking Java RMI services after JEP 290 

This repository contains all examples from my talk "Attacking Java RMI services in 2019" at BSides Munich 2019.
I also included the slides, however a more detailed explanation of this topic can be [found on our blog](https://mogwailabs.de/blog/2019/03/attacking-java-rmi-services-after-jep-290/).


## BSidesMucRmiService
This is a simple RMI service that I used as an example. It is a Maven project with CommonsCollections 3.1 bundled. Additional instructions how to build/run this service cna be found in the directory.

## BSidesAttackClient
This directory contains a minimal code example how to attack an RMI service that provides a method that accepts an arbitrary object as argument. The code needs to be imported into an project that also includes the ysoserial jar.

## barmitzwa.groovy
A [YouDebug script](http://youdebug.kohsuke.org/) that replaces the objects in a remote invocation call with an object from ysoserial.  

