access modifiers 
types of access modifier 
default - no keyword
private
public
protected 

default access modifier
when no access modifier is specified for a class method or data member it is said to have the default access modifier by default
it will run within the package the classes in the same package can access it

private access modifier 
the private access modifier is specified using the keyword private the methods or data members declared as private are accessible only within the class in which they are declared 
- any other class of the same package will not be able to access these members
- top level classes can not be declared as private since 

protected
the protected access modifier is specified using the keyword protected 
the methods or data members declared as protected are accessible within the same package or subclasses in different packages

public access modifier
- the public access modifier is specified using the keyword public 
- the public access modifier 

```|context|default|private|protected|public |
   |-------|-------|-------|---------|-------|
   | sameclass| yes|yes|yes|yes|
   |same packagage subclass| yes |no| yes|yes
	same packagenonsubclass yes no yes yes
	differnet package subclass  no no yes yes
	different package non subclass  no no no yes
```