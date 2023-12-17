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

fun calcularEstatPneumatics(kmPneumatics:Int, precio: Int): Int{
    var p = precio

    if (kmPneumatics>5000 && kmPneumatics<10000){
        p = precio - 200
    }else if ( kmPneumatics>=10000 ){
        p = precio - 300
    }
    return p
}
fun getPriceByModel(model: Int): Int {
    var price = 0
    when(model) {
        1-> price = 47500 //California Normal
        2-> price = 73490 //California Full
    }
    return price
}

fun main() {
    println("BENVINGUT A TASACIÓ DE VEHICLE")
    println("escull el número de la opció de la teva VW Califòrnia:")
    println("1- Grand Califòrnia")
    println("2- Califòrnia Full Equip")
    println("3- Sortir")

    do {
        val modelCalifornia = readln().toInt()

        var precioInicial = getPriceByModel(modelCalifornia);

        println("Indica'm els km dels teus pneumàtics")
        val estatPneumatics= readln().toInt()

        val precioFinal = calcularEstatPneumatics(estatPneumatics, precioInicial)

    }while (modelCalifornia !=3)



    println("Escriu els km de la teva California")
    val km = readln().toLong()


    //TODO mostrar preu base i preu actual
    println("El valor actual de la teva California és:"+ calculoDegradacionVehiculo(km,))
}