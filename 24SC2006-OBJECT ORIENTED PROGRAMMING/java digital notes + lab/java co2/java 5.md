single in heritance 
class a <- class b

class a {

}
class b extends a {

}

multilevel inheritance 
class a <- class b <- class c

class a {

}
class b extends a {

}
class c extends b {

}

hierarchical inheritance 

class b -> class a <- class c
public class  a{
}
public class b extends a{
} 
public class c extends a{
}

multiple inheritance 
class b <- class a ->  class c
java does not support multiple inheritance

