# Java Programming Exercises

Ten standalone programs for introductory Java practice.

## Programs

1. `ProgrammingConstructs.java` - input, variables, conditionals, switch, loops, and arrays.
2. `OopConceptsDemo.java` - encapsulation, abstraction, inheritance, and polymorphism.
3. `MethodOverloadingDemo.java` - overloaded methods with different parameters.
4. `ExceptionHandlingDemo.java` - try/catch/finally and built-in exceptions.
5. `CustomExceptionDemo.java` - a user-defined checked exception.
6. `ThreadDemo.java` - multithreading by extending `Thread`.
7. `MultipleInheritanceDemo.java` - multiple interface implementation.
8. `GenericStackDemo.java` - generic class with stack operations.
9. `AdditionCalculatorSwing.java` - Swing GUI to add two numbers.
10. `SumApplet.java` - legacy Applet GUI to add two numbers.

## Compile

Compile all examples to a separate output folder with a JDK that supports the Java 8 API:

```sh
javac --release 8 -d build *.java
```

Run a console program from the repository directory with:

```sh
java -cp build ProgrammingConstructs
```

Replace `ProgrammingConstructs` with the class name of the program you want to run. The Swing program opens a GUI window.

## Applet note

`SumApplet.java` is included because it is part of the exercise list. Java Applets are legacy technology and current web browsers do not run them. The Applet source compiles against the Java 8 API using `javac --release 8`; running it requires an older compatible applet viewer/environment.
