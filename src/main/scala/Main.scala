import scala.io.StdIn._
object Main {
  def main(args: Array[String]): Unit = {
    ejercicio3()
  }
  def ejercicio3(): Unit = {
    print("Hola bienvenido!\nPor favor ingresa el ancho de la habitacion en metros: ")
    val ancho = readFloat()
    print("Ingresa el largo de la habitacion en metros: ")
    val largo = readFloat()
    val res = largo * ancho
    println(s"El area de la habitacion es de: $res metros")
  }
}

