JAVA 8 – LAMBDA EXPRESSION & DATE-TIME API
=========================================

PROJECT OVERVIEW
-----------------------------------------
This project contains Java 8 core feature examples
commonly asked in interviews (TCS, Infosys, Wipro,
Capgemini, Cognizant, Accenture).

The focus is on:
- Lambda Expressions
- Functional Interfaces
- Date & Time API
- Optional class
- Multithreading with Callable

-----------------------------------------
JAVA DATE & TIME API (java.time)
-----------------------------------------

1) LocalDateExample
- Used to work with dates (YYYY-MM-DD)
- LocalDate.now() → current date
- LocalDate.of() → specific date (DOB)

Why used:
- Thread-safe
- Replaces old Date class

-----------------------------------------

2) LocalTimeDurationExample
- LocalTime → works with time (HH:MM)
- Duration → calculates time difference

Example use:
- Calculate minutes between two times

-----------------------------------------

3) ZonedDateTimeExample
- Used to get time based on different countries
- Uses ZoneId (Asia/Kolkata, America/New_York)

Real-time use:
- Global applications
- International systems

-----------------------------------------
OPTIONAL CLASS
-----------------------------------------

4) OptionalExample
- Used to avoid NullPointerException
- Methods:
  - isPresent()
  - orElse()
  - ifPresent()

Why used:
- Safe handling of null values
- Cleaner code

-----------------------------------------
FUNCTIONAL INTERFACES
-----------------------------------------

Functional Interface:
- Interface with only ONE abstract method
- Used with Lambda Expressions

-----------------------------------------

5) ComparableExample
- Used for sorting
- Method: compareTo()
- Example: Sorting names list

-----------------------------------------

6) CallableExample
- Used in multithreading
- Returns result (unlike Runnable)
- Uses ExecutorService

Why used:
- Asynchronous task execution
- Better thread control

-----------------------------------------
PREDEFINED FUNCTIONAL INTERFACES
-----------------------------------------

7) PredicateExample
- Input → 1
- Output → boolean
- Used for condition checks

-----------------------------------------

8) ConsumerExample
- Input → 1
- Output → nothing
- Used to perform actions

-----------------------------------------

9) SupplierExample
- Input → none
- Output → value
- Used to generate data

-----------------------------------------

10) FunctionExample
- Input → 1
- Output → 1
- Used for transformations

