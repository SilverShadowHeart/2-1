this()
constructor chaining it is similar to overloading
writing the same constructor names multiple times
for chaining we need to use this() and super()

it can be done in two ways this() and super()
same class different constructors this()

constructor chaining in java is a technique where one constructor invokes another constructor to initialize an object this can be done with in the same class using the this() keyword or from a parent class with super() which is important in inheritance


key rules
1. call to this() or super() must be the first statement in a constructor
2. only one constructor call this() and super() is allowed with in a single constructor
3. infinite loops caused by circular calls should be avoided


static keyword in java
what is a static keyword?
the static keyword is a non access modifier used for 
- variable (class-level , shared across instances)
- methods (called without object creation)
- block (executed once when the class loads)
- nested classes (static inner classes)
here are some characteristics of the static keyword in java:
- static variables and methods use memory only once when the program runs and this memory is shared by all the objects of the class
- we do not need to create objects of the class to use the static methods 
- we can call static member using  the class name directly 
- static members belong to the class to any specified object 
- static member can not access non static members
- static methods cannot be over ridden in the sub classes because they belong to the class not to an object