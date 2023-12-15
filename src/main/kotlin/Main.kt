package org.example

fun calculoDegradacionVehiculo(km:Long, precio:Double): Double {
    //funcion la cual calcula la degradacion del vehiculo conforme pasan los kms.
    val depreciacionPorcentaje = 0.00001
    val depreciacion:Double = km * depreciacionPorcentaje
    val valorActual = precio - (precio * depreciacion/100)
    return valorActual
}


fun main() {
    println("Escriu el preu de la teva California")
    val precio= readln().toDouble()
    println("Escriu els km de la teva California")
    val km = readln().toLong()

    println("El valor actual de la teva California és:"+ calculoDegradacionVehiculo(km, precio))
}