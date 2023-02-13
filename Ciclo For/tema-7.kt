//Algoritmo que pide un numero para ejecutar una
//cantidad de veces y saber si un numero es divisible de 11

fun main() {

    // Pide al usuario que ingrese la cantidad de veces que desea ejecutar el algoritmo
    print("Ingrese la cantidad de veces a ejecutar el algoritmo: ")
    var veces = readLine()!!.toInt();

    // Repite el proceso las veces que tiene el valor de la variable "veces"
    for(i in 1..veces){
        
        // Pide al usuario que ingrese un número y muestra el número de iteración actual
        println("Ingrese el numero para saber si es divisible entre 11 - $i")
        var numero = readLine()!!.toInt();
    
        // Verifica si el número ingresado es divisible entre 11
        if(numero % 11 == 0){
            println("El numero $numero si es divisible entre 11!")
        }else{
            println("El numero $numero no es divisible entre 11")
        }

    }

}