val amounts = Array(10,50,40)

val currencies = Array ("GBP", "SOS" )

val result: Array[String] = for {
  amount <- amounts
  currency <- currencies
} yield currency + " " + amount





