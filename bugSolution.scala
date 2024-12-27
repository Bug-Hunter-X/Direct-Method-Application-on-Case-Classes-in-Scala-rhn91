```scala
object MyClass {
  def myMethod(x: Int, y: Int): Int = x + y
}

object Main extends App {
  println(MyClass.myMethod(5, 10)) //Correct way to call the function
}
```