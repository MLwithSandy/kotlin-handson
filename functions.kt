fun main(){
  println("testing functions")
  greet("John")
  greet("Jane")

  // call foo with a lambda as an argument
  foo { println("inside bar") }
  foo (bar = { println("inside bar - as a named argument")})

  // test function with return value
  var result = sum(1, 2)
  println("result is $result")

  result = sum2(1, 2)
  println("result is $result")

}

// define a function greet that takes a string as an argument
fun greet(name: String){
  println("Hello $name")
}

//function with function argument
fun foo(bar: () -> Unit){
  println("inside foo: before calling bar")
  bar()
}

// function with return value
fun sum(a: Int, b: Int): Int{
  return a + b
}

fun sum2(a: Int, b: Int) = a + b