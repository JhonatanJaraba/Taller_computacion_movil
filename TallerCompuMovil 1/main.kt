/*Desarrolladores:
Ricardo Sibaja
Yonatan Jaraba */

fun main(args: Array<String>) {
  mainMenu()
}

fun mainMenu() {
  var validar = true;
  while (validar) {
    println()
    println("Elija una de las siguientes opciones: ")
    println("1. Generar los N primeros números de la serie Fibonacci")
    println("2. Calcular la sumatoria de un número N")
    println("3. Generar los 10 primeros números primos")
    println("4. Calcular el área de un círculo")
    println("5. Convertir Centígrados a Fahrenheit y Kelvin")
    println("6. Salir")
    println()
    println("Ingrese una de las opciones:")
    val option = readLine()
    when (option)  {
      "1" -> {
      println("Ingrese la cantidad de números a generar ")
      calcFibonacci(readLine()!!.toInt())
      }
      "2" -> {
        println("Ingrese el número N para calcular la sumatoria")
      getSum(readLine()!!.toInt())
      }
      "3" -> {getPrimeNumbers()
      }
      "4" -> {
          println("Ingrese el radio: ")
          val radio = readLine()!!.toDouble() 
          val area = (radio * radio) * 3.14
          println("El área del circulo es igual a $area")
      }
      "5" -> {
          print("Ingrese la temperatura en centigrados: ")
          val centigrados = readLine()!!.toLong()
          val Fahrenheit = (centigrados * 1.8) + 32
          val Kelvin = centigrados + 273.15
          
          println("($centigrados)°C son iguales a ($Fahrenheit)°F y ($Kelvin)°K")
      }
      "6" -> validar = false;
      else -> println("Opción inválida")
    }
  }
}

fun calcFibonacci(n: Int) {
  var res = "";
  var t1 = 0
  var t2 = 1
  for (i in 1..n) {
    res = "$res $t1"
    val sum = t1 + t2
    t1 = t2
    t2 = sum  
  }
  println("Los $n primeros números de la serie fibonacci son: $res")
}

fun getSum(n: Int) {
  var sumatoria = 0
  for (i in 1..n) {
    sumatoria += i
  }
  println("La sumatoria de $n es: $sumatoria")
}

fun validarPrimo(x: Int) : Boolean {
    for (i in 2..x / 2) {
        if (x % i == 0) {
            return false
        }
    }
    return true
}

fun getPrimeNumbers () {
  var res = ""
  var i = 0
  var x = 1
  while (i < 10) {
    if (validarPrimo(x)) {
      res = "$res $x"
      i = i + 1
    }
    x = x + 1
  }
  println("Los diez primeros números primos son $res")
}