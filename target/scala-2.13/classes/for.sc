val amounts = Array(10,50,40)

val currencies = Array ("GBP", "SOS" )

val result: Array[String] = for {
  amount <- amounts
  currency <- currencies
} yield currency + " " + amount


val result: Array[String] = for {
  amount <- amounts
  currency <- currencies
  if amount > 20 && (currency == "GBP" || currency == "SOS")
} yield currency + " " + amount

// For each is a statement

amounts.foreach(amount => println(amount * 100))

// While Loops

var i = 1
while (i <= 10) {
  i = i + 1
  print(i)
}


