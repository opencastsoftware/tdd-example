# Class With Bugs

In this example we have used the starter Kata for [Kotlin](https://github.com/opencastsoftware/kata-starters/tree/main/kotlin) which has a simple `increment` function.

People may copy and paste existing code as a way to accelerate their process, this can often lead to errors.

The `increment` function already had a unit test in place which was passing, but someone has tried to implement a `decrement`
function without adding a unit test first.

Can you spot the very well hidden bug, by writing a unit test first, then making the test pass?

<details>
<summary>Info</summary>

## What does this provide?

- A simple Kotlin project that's set up with gradle as the build tool
- Testing using JUnit 5

## Using this template

### Prerequisite requirements

A Java 8+ JDK and gradle.

### Coding and running

- When running commands - ensure that this folder (`kotlin/`) is your working directory
- When coding in IDE - open this folder (`kotlin/`) in the IDE not the parent folder, otherwise tools like `IntelliJ` may not be able to give code hints or run formatters

### Key commands

- `./gradlew compile` - compile the project.
- `./gradlew test` - runs JUnit tests.

</details>
