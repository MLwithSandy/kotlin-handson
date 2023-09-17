class SmartDevice {
  // properties
  var brand: String = ""
    get()= field.uppercase()
    set(value) {
      field = value
    }

  var model: String = ""
    get() = field
    set(value) {
    field = value
    }


  var price: Double = 0.0
    get() = field
    set(value) {
      field = value
    }

  //methods
}

fun main(){
  val myPhone = SmartDevice()
  myPhone.brand = "Samsung"
  myPhone.model = "Galaxy S9"
  myPhone.price = 999.99

  println("my phone is ${myPhone.brand} ${myPhone.model} and it costs ${myPhone.price}")
}