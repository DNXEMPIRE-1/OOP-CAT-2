# BBT 1203 CAT 2 Submission

## Question 1: OOP Concepts
1. **Encapsulation (Student.java)**
   - Private attributes: name (String), grade (int)
   - Public getters and setters implemented
   - Grade validation: 0-100 range check

2. **Method Overloading and Overriding**
   - MathOperations.java: Two multiply() methods (2 and 3 parameters)
   - Animal.java: Base class with makeSound()
   - Dog.java & Cat.java: Override makeSound()
   - Main.java: Demonstrates polymorphism

## Question 2: Abstraction and Exception Handling
1. **Abstraction**
   - Appliance.java: Abstract class with turnOn()
   - Fan.java & TV.java: Concrete implementations
   - ApplianceDemo.java: Shows abstraction in action

2. **Exception Handling**
   - DivisionProgram.java:
     - Takes two numbers from user
     - Handles division by zero with try-catch
     - Displays "Cannot divide by zero!" message

## Compilation and Running
- All .java files compile without errors
- Use `javac *.java` to compile
- Run demos with:
  - `java Main` (Q1 polymorphism)
  - `java ApplianceDemo` (Q2 abstraction)
  - `java DivisionProgram` (Q2 exception handling)
