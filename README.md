# Java Programming Exercises

Ten standalone Java programs for introductory programming practice.

| File | Topic |
| --- | --- |
| `program1.java` | Programming constructs: input, conditionals, loops, switch, and arrays |
| `program2.java` | OOP concepts: encapsulation, abstraction, inheritance, and polymorphism |
| `program3.java` | Method overloading |
| `program4.java` | Exception handling with try/catch/finally |
| `program5.java` | User-defined exception subclass |
| `program6.java` | Multithreading by extending `Thread` |
| `program7.java` | Multiple inheritance through interfaces |
| `program8.java` | Generic class and stack operations |
| `program9.java` | Swing calculator for adding two numbers |
| `program10.java` | Legacy Applet for adding two numbers |

## Compile

Compile all examples to a separate output folder with a JDK that supports the Java 8 API:

```sh
javac --release 8 -d build program*.java
```

Run a console example with:

```sh
java -cp build program1
```

The Java class names are `program1` through `program10`, matching the numbered source files. `Program9` opens a Swing GUI window.

## Applet note

`program10.java` is included because it is part of the exercise list. Java Applets are legacy technology and current web browsers do not run them. The Applet source compiles against the Java 8 API using `javac --release 8`; running it requires an older compatible applet viewer/environment.

