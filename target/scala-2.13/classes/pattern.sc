import java.beans.Expression

var amount = 500


amount match {
  case 50 => println("£50")
  case 100 => print("£100")
  // This means if it cannot find a match then print what's inside these parastaseis (remember the _ sign )
  case _ => println("Not a £50 or £100 note")
}

// variable pattern matching

var amount = 100

amount match {
  case a if a == 50 => println("bill is £ 50")
  case a if a == 100 => println("bill is £ 100")
  // this line must be printed last as to allow to check for other possible matches first
  case a => println("The amount printed is " + a)

}

// Expression pattern matching

var amount = 1000

val result: String = amount match {
  case a if a == 50 => "note is == 50"
  case a if a == 100 => "bill is £100"
  case a => "the amount is " + a
}


// Performing patten matching on Types
// abstract means this class is blank and contain no implementations
abstract class Currency
// All inherit from Currency using extends keyword
// Case class provides immutable instances, easier instance cloning using copy, automatic generated equals and has code methods
case class GBP() extends Currency
case class USD() extends Currency
case class SOS() extends Currency

val currency: Currency = USD()


val amount = 100

currency match {
  case g: GBP => print("GBP " + amount)
  case s: SOS => print("SOS " + amount * (1/756.54))
  case u: USD => print("USD " + amount * (1/1.31))
}

// Extracting data using pattern matching.

val anArray = Array(100, 200, 300)

anArray match {
  case Array (first, second, third) => println("third = " + third)
}
// pattern matching using tuple
val aTuple = (SOS, 700)
// aTuple._1 refers to position
// aTuple._2 refers to 700
println(aTuple._2)

aTuple match {
  case (currency, amount) if currency == "SOS" => println("SOS " + amount)
}



