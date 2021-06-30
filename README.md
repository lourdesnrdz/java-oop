# Java SE Object Oriented
OOP Course Java SE

## Table of contents

* [General info](#general-info) 
* [Technologies](#technologies) 
* [Setup](#setup)
* [Concepts](#concepts)

## General info
 On this course I learned to apply Object Oriented Programming in Java. We analized and created a solution to the medical appointments problem, where we applied concepts sush as inheritance and polimorfism. 

 Also, I learned to use abstract classes and methods, annomymous classes, interface and the difference between all these.

 We also made use of collections throughout the course, such as ArrayList, Map and TreeMap.

 One important thing that I take with me from this course is the importance of modularity and how by splitting the program into smaller sections we can create more readable programs. This allows us to detect problems or errors faster, to re-use code and makes mainting the code easier.


## Technologies

On this course I used the following development technologies:
 <!-- - Visual Studio Code -->
 - Git
 - Github
 - IntelliJ IDEA 2021 1.2
 - OpenJDK 11

## Setup

The setup for this project was made on a Windows 10 OS.

### IntelliJ IDEA

1. Go to [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
2. Download the Community version (Free, built on open source)

### OpenJDK
For this course we used 2 versions of OpenJDK.

1. Go to [https://adoptopenjdk.net/](https://adoptopenjdk.net/)
2. Download the following versions:
    - OpenJDK 8
    - OpenJDK 11

### Concepts

* **Don't Repeat Yourself:** consists on identifying when we are repeating the same code over and over again, and create a method or function to avoid this.
* **Inheritance:** consists on creating new classes from other classes, establishing a father - son relationship.
    * Subclasses can access to all the attributes and methods of the Superclass
* **Polimorfism:** consists on overriding some methods of the class from which the subclasses inherit from to assign different behaviors.
* **Interfaces:** is a reference type that contains only constants and method definitions.
    * Define the form of a class (method names, arguments, return type, but not blocks of code)
* **Collections:** work with collections of data with the condition that they must be objects.
* **Abstract Classes:** combination of interfaces and inheritance where we don't need to implemment all the methods nor create instances.
    * Abstract methods: are the methods that we have to implemment every time we use the abstract class.

#### Difference between an Interface and Abstract Class
The main difference is when we use an interface and when an abstract class. 

An abstract class is used to define subclasses, it will always be inherited and used to override methods. We can't create instances or objects, therefore it is only useful to redefine new classes without the need to create new objects.

The Interface is similar to this, however, the key difference is that the methods can ve implemmented in many class families (it's not lineal as with inheritance). 



