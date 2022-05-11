object MethodsAndFunctions extends App {


  // array of popular stocks
  val data = Array("PS", "MSFT", "GOOG", "AAPL", "TSLA")

  // A method is reusable code, that is defined using the DEF keyword - it is always part of a class
  def getNumRowsMethod(): Int = data.length

  // Function - complete object by itself - an instance of a class which implements traits contains it own methods
  val getNumRowsFunction = () => data.length
  // invoking the method & function
  println("Total number of rows (method): " + getNumRowsMethod())
  println("Total number of rows (function):" + getNumRowsFunction)

  // invoked the method, which has returned an integer data type
  // Calling getClass on an integer give us int
  println(getNumRowsMethod().getClass)
  // A reference to an object, this does not invoke the function - result that is printed to screen is a lambdas
  println(getNumRowsFunction.getClass)
  // invoking a function - what you are actually executing or invoking is the apply method within a function
  // A function object is an instance of a class that implements traits that contain this apply method
  // invoking an apply method on a function objects is the equivalent of invoking that function
  println(getNumRowsFunction.apply())
  println(getNumRowsFunction.isInstanceOf[Function0[_]])

  // methods takes one argument ticker which is of type string
  // This method returns a boolean result type
  // It also checks whether the data array contains this particular ticker
  def existsMethod(ticker: String): Boolean = data.contains(ticker)
  // Function takes one argument ticker which is of type string
  // It also checks whether the data array contains this particular ticker
  val existsFunction = (ticker: String) => data.contains(ticker)
  // Method being converted to a function objects
  // Converting existsMethod _ to exists
  val exists = existsMethod _

  // Invocation for the method
  println("Does PS exist (method):" + existsMethod(ticker = "PS"))
  // Invocation for the function
  println("Does TM exist (function):" + existsFunction("TM"))
  // Invocation of the now converted method to function
  println("Does GOOG exist (function):" + exists("GOOG"))

}
