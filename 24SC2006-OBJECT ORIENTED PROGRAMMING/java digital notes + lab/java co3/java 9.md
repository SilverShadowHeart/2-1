lambda expressions

(argument list ) -> {body of the expression}

types of lambda expressions 
there are three lambda expressions 
parameters are mentioned below
 lambda with zero parameters
  lambda with single parameter
  lambda with multiple parameters


functional interfaces- predicate interface 

the predicate interface in java is a functional interface introduced in java 8 as part of the java.util.function package it represents a single argument function that returns a boolean value ,indicating whether a given condition is true or false for the input 

key characteristics of predicate 

Abstract method :
the single abstract method is boolean test(T,t) which takes an argument of type T and returns a boolean value

purpose

it has some methods like and or negate() etc 

they are functional interface means it has only one method 

to define student marks name grade and create predicate to check if th student passed or failed an exam marks  >60 pass grade a >b