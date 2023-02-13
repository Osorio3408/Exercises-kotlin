//Algoritmo que pide el nombre y las 3 notas del estudiante
//para saber si aprobó o reprobó y si reaprobó arriba de 
//2.5 notificarle que puede recuperar con condiconales anidadas

fun main() {

    //se define una variable tipo var de nombre prom como Double y se dice que el valor es nulo
    var prom:Double?


    //muestra por consola los datos que necesita 
    print("Ingrese el nombre del estudiante: ")

    //guarda los datos que ingresa el usuario
    var nombre = readLine()!!.toString();

    print("Ingrese la primera nota del estudiante: ")
    var nota1 = readLine()!!.toDouble();

    print("Ingrese la segunda nota del estudiante: ")
    var nota2 = readLine()!!.toDouble();

    print("Ingrese la tercera nota del estudiante: ")
    var nota3 = readLine()!!.toDouble();

    //en la variable declarada anteriormente se hace la operacion para saber el promedio
    prom = (nota1 + nota2 + nota3)/3;

    //se hace la condicion para saber si el promedio es mayor a 3 si es asi muestra 
    //que aprobó de lo contrario mostrará por consola que reaprobó
    if(prom >= 3.0){
        print("El estudiante $nombre aprobó con un promedio de: $prom")
    }else{
        println("El estudiante $nombre reaprobó con un promedio de: $prom")
        
        //si el estudiante reaprobó pero el promedio es mayor de 2.5 
        //se mostrará por consola que puede recuperar
        if(prom >= 2.5){
            print("El estudiante puede recuperar!")
        }
    }

}