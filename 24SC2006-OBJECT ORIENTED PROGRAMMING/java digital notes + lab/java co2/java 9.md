abstract class
in java abstract class is declared with the abstract keyword it may have both abstract methods and non abstract methods methods (methods with bodies )


in java the following some important observations about abstract classes are as follows

an instance of an abstract class can not be created
constructor are allowed 

we have an abstract class without any abstract method 

there can be  a final method in abstract class bit any abstract method in class (abstract class) can 
not be declared as final or in simpler terms final method can not be abstract itself as it will yield an error: "illegal combination of modifiers abstracta and final "

we can define static methods in an abstract class

we can use the abstract keyword for declaring top level classes outer class as well as the inner classes as abstract 

if a class contains at least one abstract method then compulsory should declare a class as abstract 


if the child class is unable to provide implementation to all abstract methods of the parent class then we should declare that child class as abstract so that the next level child class should provide implementation to remaining abstract method 

