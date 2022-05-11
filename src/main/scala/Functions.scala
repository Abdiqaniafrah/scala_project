object Functions extends App {

  // function is really just a named reusable expression block
  // functions are named reusable expression blocks


  // In most cases the terms functions and methods can be used interchangeable (named bits of reusable code)
  // In scala however functions and methods are not the same

  //     FUNCTIONS
  // Functions are Objects - Functions are instances of a class and have there own METHODS
  // Methods are not
  // You instantiate function objects
  // function objects are first class entities like CLASSES
  // Functions are not explicitly associated with a class
  // val getCount = (arguments) => {function code inside}

 // ------------------------------------------------------------------


  //     METHODS
  // Methods are defined using the def keyword
  // All methods are desiccated with a class within which they are defined
  // Methods are not OBJECTS
  // Methods and Objects can be used interchangeably, because METHODS ARE STORE IN OBJECTS - functions however are objects
  // Methods can be converted to functions but methods by themselves are not first class entities
  // def getCount(input arguments and return type): Int = {method code}


  // method name getArea
  def getArea(radius: Double): Double = {
    val PI = 3.14;
    PI * radius * radius
  }
println(getArea(7))


/*  Functions & Method - Similarities
Reusable unit of code
Executed when invoked
Can accept input arguments
May return results
 */
 /*
  Functions- A complete standalone object which is an instance of a class.
  Function - A Function class implement traits in Scala
  Function - A Function object has its own methods
  Function - Value types- can be stored in VAL and VAR storage
  Function - Objects of type Function0, Function1
  Function - Invoking a function invokes the apply() method on a function
  Function - can be anonymous
  Function - Assigned to a VAL or VAR type which is then used to ink function
  Function - Slightly slower, and higher overhead
  Function - Are first class entities on par with classes
  Function - Do not accept type parameters or parameter default values


  Method -  Method is part of a class and always associated with a class
  Method - Method has a name, signature and annotations
  Method - Method has bytecode associated with the code executed
  Method- Not value types- can not serve as r-values - defined using DEF
  Method- Not Objects, but can be converted to function objects quite easily
  Method - Invoking a method runs the code associated with the method
  Method - Always has a name
  Method- Methods invoked using the name specified at definition.
  Method - Slightly faster and better performing
  Method - Are not first class entities unless converted to functions
  Method - Work fine with type parameters and parameter default values
  */



}
