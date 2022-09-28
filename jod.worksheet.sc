println("Hello World")

val x = 0

if (x < 0) 
  println("negative")
else if (x > 0)
  println("positive")
else 
  println("zero")


val people = List("Alice", "Bob")

people.foreach(p => println(p))
for (p <- people) println(p)

val ints = List(1,2,3,4,5,6,7,8)

// yield
// map
val ints1 = for (i <- ints) yield i + 1

// loop with guard
// filter
val moreThan5 = for (
    i <- ints
    if i > 5
) yield i

