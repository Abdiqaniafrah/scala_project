object FunctionLiteralAndPlaceholders extends App {


  // Function literals in the source code get compiled into a class that is instantiated at runtime
  var multiply = (c: Int) => x * 100
  println(multiply(3))
}
