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


