package org.example

fun calculoDegradacionVehiculo(km:Long, precio:Double): Double {
    //funcion la cual calcula la degradacion del vehiculo conforme pasan los kms.
    val depreciacionPorcentaje = 0.00001 //és un percentatge
    val depreciacion:Double = km * depreciacionPorcentaje
    val valorActual = precio - (precio * depreciacion/100)
    return valorActual
}

fun calcularPreuBase(){

}

fun calcularPreuActual(){

}

fun main() {
    println("BENVINGUT A TASACIÓ DE VEHICLE")
    println("escull el número de la opció de la teva VW Califòrnia:")
    println("1- Grand Califòrnia")
    println("2- Califòrnia Full Equip")
    println("3- Sortir")

    do {
        val modelCalifornia = readln().toInt()

        if (modelCalifornia==1){

        }else if (modelCalifornia==2){

        }else println("L'opció no existeix")

    }while (modelCalifornia !=3)

    val precio= 73490
    println("Escriu els km de la teva California")
    val km = readln().toLong()

    println("El valor actual de la teva California és:"+ calculoDegradacionVehiculo(km))
}