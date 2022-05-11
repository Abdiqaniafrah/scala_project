object VarValLazyValDef extends App {

  var stockPrice = 14
  var volume = 100

  volume = 1000
  var finalValue = stockPrice * volume

  println(s"Final value is: $finalValue")

  // expression block
  // the last statement in an expression block is the result returned
  var data = {println("Array is initialized"); Array (
    "Arsenal", "Spurs", "United"
  )}
  println("Before accessing data")
  data.foreach(println)

  println("---------------------------")
  data.foreach(println)

  // Val do not permit reassignment
  // Val can be MODIFIED

  val dataVal = {println("Array is initialized"); Array (
    "REAL", "LIVER", "CITY"
  )}
  println("Before accessing data")
  dataVal.foreach(println)

  println("---------------------------")
  // Val can be MODIFIED
  // changing the values at index 0 and 2, meaning val objects can be MODIFIED
  // Its not POSSIBLE to REASSIGN data to an entirely new array
  // its possible to modify the object which the val references, but its not possible to reassign
  dataVal(0) = "BAY"
  dataVal(2) = "PSG"
  dataVal.foreach(println)


  // Def is used to define methods. The code within the method is not evaluated at the time of definition, but instead the method/code is executed when invoked.

  // method that take a input argument and returns (eg. 14/100)
  def stockPrices: Int = 14
  def volumes: Int = 100


  def finalValues: Int = stockPrices * volumes

  // finalValues to return type string, add .toString
  def changingToString: String = (stockPrices * volumes).toString
  println(s"The final value is: $finalValues" )




  def numbers: Int = {
    println("Returning Stock Prices")
    99
  }

  def figures: Int = {
  println("Returning Volume ")
    17
  }
  // finalvalueAgain stockPrices and stockPrices invoked as the  method has been evaluated or executed
  def finalvalueAgain: Int = stockPrices * volumes
  println(s"the final value is: $finalvalueAgain" )



  def finalData:Array[String] = {
    // after the method call, then this line is executed and printed to console
    // Once the method invocation is complete, then the array is printed to screen
    println("Array is initialized")
    Array("Google", "Microsoft", "Tesla")
  }
  // "Before accessing data" is printed first before "Array is initialized" even though Array is initialized was defined first
//
  println("Before accessing data")
  // method invocation or method call
  finalData.foreach(println)

  // Every method invocation runs the code associated with the method
  println("----------------------")
  finalData.foreach(println)


  var y = 15
  lazy val x = 50
  // cannot reassign lazy val
  //x = 75

 // var finalValue = y * x
  println(s"Final value is: $finalValue")



}
