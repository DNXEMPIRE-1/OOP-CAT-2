# BBT 1203 CAT 2 Submission

## Overview
This repository contains solutions for CAT 2 of Object-Oriented Programming I (BBT 1203). The code demonstrates key OOP concepts in Java including encapsulation, method overloading/overriding, abstraction, and exception handling.

## Files and Structure

### Question 1: OOP Concepts
1. **Student.java**
   - Implements encapsulation with private `name` and `grade` attributes
   - Public getters and setters
   - Grade validation (0-100 range)

2. **MathOperations.java**
   - Demonstrates method overloading with two `multiply()` methods:
     - Two integers
     - Three integers

3. **Animal.java**, **Dog.java**, **Cat.java**, **Main.java**
   - Implements method overriding and polymorphism
   - `Animal` base class with `makeSound()`
   - `Dog` and `Cat` subclasses override `makeSound()`
   - `Main` demonstrates polymorphic behavior

### Question 2: Abstraction and Exception Handling
4. **Appliance.java**, **Fan.java**, **TV.java**, **ApplianceDemo.java**
   - Demonstrates abstraction
   - `Appliance` abstract class with `turnOn()`
   - `Fan` and `TV` concrete implementations
   - `ApplianceDemo` shows abstraction in action

5. **DivisionProgram.java**
   - Implements exception handling
   - Handles `ArithmeticException` for division by zero
   - Displays "Cannot divide by zero!" message

## Compilation and Execution
1. Compile all files:

2. Run demonstrations:
- Polymorphism: `java Main`
- Abstraction: `java ApplianceDemo`
- Exception Handling: `java DivisionProgram`

## Notes
- All code compiles and runs successfully
- Follows CAT 2 guidelines for structure and clarity
- Submit this repository link within the allocated time
