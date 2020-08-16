# Design patterns course

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)  ![technologyJava](https://img.shields.io/badge/JDK-14-blue.svg)     ![technologyJava](https://img.shields.io/badge/Gradle-6.3-blue.svg)

This app also uses Gradle 5.6.1, to run any gradle commands, do so using the provided gradle wrapper, e.g:

```shell script
./gradlew run
```

### Dependency Updates

This app uses [Gradle Versions Plugin](https://github.com/ben-manes/gradle-versions-plugin) to check dependency updates. To check for updates, run:

```shell script
./gradlew dependencyUpdates
```

You can also install the [gradle-upgrade-interactive](https://github.com/kevcodez/gradle-upgrade-interactive) CLI tool to choose which dependencies to update. Run:
```shell script
gradle-upgrade-interactive
```
# Design patterns introduction
In software engineering, a design pattern is a general repeatable solution to a commonly occurring problem in software design. A design pattern isn't a finished design that can be transformed directly into code. It is a description or template for how to solve a problem that can be used in many different situations.

### Creational design patterns
These design patterns are all about class instantiation. This pattern can be further divided into class-creation patterns and object-creational patterns. While class-creation patterns use inheritance effectively in the instantiation process, object-creation patterns use delegation effectively to get the job done.

* Abstract Factory: Creates an instance of several families of classes
* Builder: Separates object construction from its representation
* Factory Method: Creates an instance of several derived classes
* Object Pool: Avoid expensive acquisition and release of resources by recycling objects that are no longer in use
* Prototype: A fully initialized instance to be copied or cloned
* Singleton: A class of which only a single instance can exist

### Structural design patterns 
These design patterns are all about Class and Object composition. Structural class-creation patterns use inheritance to compose interfaces. Structural object-patterns define ways to compose objects to obtain new functionality.
* Adapter: Match interfaces of different classes
* Bridge: Separates an object’s interface from its implementation
* Composite: A tree structure of simple and composite objects
* Decorator: Add responsibilities to objects dynamically
* Facade: A single class that represents an entire subsystem
* Flyweight: A fine-grained instance used for efficient sharing
* Private Class Data: Restricts accessor/mutator access
* Proxy: An object representing another object

### Behavioral design patterns
These design patterns are all about Class's objects communication. Behavioral patterns are those patterns that are most specifically concerned with communication between objects.
* Chain of responsibility: A way of passing a request between a chain of objects
* Command: Encapsulate a command request as an object
* Interpreter: A way to include language elements in a program
* Iterator: Sequentially access the elements of a collection
* Mediator: Defines simplified communication between classes
* Memento: Capture and restore an object's internal state
* Null Object: Designed to act as a default value of an object
* Observer: A way of notifying change to a number of classes
* State: Alter an object's behavior when its state changes
* Strategy: Encapsulates an algorithm inside a class
* Template method: Defer the exact steps of an algorithm to a subclass
* Visitor: Defines a new operation to a class without change

#
#### Class Nº 1
Tengo que sacar un credito. Monto, Cantidad de pagos, interes.

hacer una html con la planilla de pagos


1) 100 900
2) 100 800
3) 100 700

Ingresar por consola los tres itemos Monto, cantidad de pagos, interes, Sistema amortizacion
#

