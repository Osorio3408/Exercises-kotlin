//Algoritmo que me diga que dia de la semana es segun
//el numero ingresado usando condicionales con when
fun main(){

    //Se muestra por consola que ingrese un numero
    print("Ingrese un numero: ")

    //se guarda el dato en la variable dia usando readLine y se comvierte en Int(entero)
    var dia = readLine()!!.toInt();

    //Se usa el when para realizar el codigo pertinente al dato ingresado
    when(dia){

        //son las posibles opciones que tiene al obtener el dato de la variable dia
        1 -> print("El dia es Lunes!")
        2 -> print("El dia es Martes!")
        3 -> print("El dia es Miercoles!")
        4 -> print("El dia es Jueves!")
        5 -> print("El dia es Viernes!")
        6 -> print("El dia es Sabado!")
        7 -> print("El dia es Domingo!")

        //si no se cumple las anteriores opciones se imprime por consola este
        else -> print("El numero no tiene un dia asignado!")
    }

}
