// Scala knows volume is of type integer
val volume = 1000

volume

println(s"volume is: $volume")

var stockPrice = 80

println(s"Stock price is currently: $stockPrice ")

stockPrice = 70

print(s"Stock price has now changed to: $stockPrice")

// def is used to define methods, that is reusable bits of code, which are evaluated each time they are invoked
// volume is no-longer a var or a val to which we assign a value.
// Now volume is a METHOD which return the integer value 1000
def volume: Int = 99

def stockPrice: Int = 25

def finalValue: Int = stockPrice * volume

// you must invoke the finalValue method to get the desired value
finalValue



// lazy val

val faceValue = 5
// lazy val is immutable but is evaluated lazily
// eg it is evaluated the first time it is referenced in code
lazy val lazyFaceValue = 5
faceValue
// the lazy val is evaluated NOW so the value 5 is printed to the console
lazyFaceValue

