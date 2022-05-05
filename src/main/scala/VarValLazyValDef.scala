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

  dataVal(0) = "BAY"
  dataVal(2) = "PSG"
  dataVal.foreach(println)


  // Def is used to define methods. The code within the method is not evaluated at the time of definition, but instead the method/code is executed when invoked



}
