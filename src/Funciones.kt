//Maria Paula Rivera
fun main() {
    var menu = true
    while (menu){
        println("1. Suma")
        println("2. Resta")
        println("3. Raíz")
        println("4. Cuadrado")
        println("5. Saludo")
        println("6. División")
        println("7. Multiplicación")
        println("8. Salir")
        println("Digita la opción")
        var op = readln().toInt()

        if (op == 1){
            suma()
        }else if(op==2){
            resta()
        }else if(op==3){
            println("La raíz es: ${raiz()}")
        }else if(op ==4){
            println(cuadrado())
        }else if (op==5){
            println(saludo())
        }else if (op==6){
            division(12.0,2.0)
        }else if(op == 7){
            println("La multiplicación es: ${multi(8.0,2.0)}")
        }else if(op == 8){
            menu = false
        }else if (op > 8){
            println("El número no corresponde al menú")
        }
    }

}
var num1=6.0
// Sin parámetro y sin retorno
fun suma(){
    var n1 = 5
    var n2 = 6
    var suma = n1+n2
    println("La suma es: ${suma}")
}
fun resta(){
    var n1 = 12
    var n2 = 6
    var resta = n1-n2
    println("La resta es: $resta")
}
//Sin parámetro con retorno
fun raiz():Double{
    return Math.sqrt(num1)
}
fun cuadrado ():Double{
    return Math.pow(num1,2.0)
}
fun saludo():String{
    return "Hola clase"
}
//Con parámetro y sin retorno
fun division (numero1:Double, numero2:Double){
    if (numero2 != 0.0){
        var div = numero1/numero2
        println("La división es: ${div}")
    }else{
        println("No se puede dividir por 0")
    }
}
//Con parámetros y con retorno
fun multi(n1:Double, n2:Double):Double {
  return  n1 * n2
}