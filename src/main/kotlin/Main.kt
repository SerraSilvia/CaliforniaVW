package org.example

fun calculoDegradacionVehiculo(km:Long, precio:Double): Double {
    //funcion la cual calcula la degradacion del vehiculo conforme pasan los kms.
    val depreciacionPorcentaje = 0.00001 //és un percentatge
    val depreciacion:Double = km * depreciacionPorcentaje
    val valorActual = precio - (precio * depreciacion/100)
    return valorActual
}

fun calcularEstatPneumatics(kmPneumatics:Long, precio: Double): Double{
    var p = precio

    if (kmPneumatics>5000 && kmPneumatics<10000){
        p = precio - 200
    }else if ( kmPneumatics>=10000 ){
        p = precio - 300
    }
    return p
}
fun getPriceByModel(model: Int): Double {
    var price = 0.0
    when(model) {
        1-> price = 47500.0 //California Normal
        2-> price = 73490.0 //California Full
    }
    return price
}

fun getPriceByPortabicis(portabicis: Boolean, precio: Double ): Double {
    if (portabicis) return precio + 250

    return precio
}
fun getPriceByYearsKm(anysVehicle: Int, kmVehicle: Long, precio: Double): Double{
    if (anysVehicle >= 6 && anysVehicle <= 10) {
        var devaluacio = kmVehicle * 0.0002;
        return precio - devaluacio
    }

    if (anysVehicle > 10) {
        var devaluacio = kmVehicle * 0.0004;
        return precio - devaluacio
    }

    return precio
}
fun printAsciiArt() {
    val asciiArt = """ 
        $BLUE_BOLD **********************************
         * BENVINGUT A TASACIÓ DE VEHICLE *
         **********************************$RESET
         $CYAN_BOLD
           ---------------------------.
         `/""${'"'}${'"'}/""${'"'}${'"'}/|""|'|""||""|   ' \.
         /    /    / |__| |__||__|      |
        /----------=====================|
        | \  /V\  /    _.               |
        |()\ \W/ /()   _            _   |
        |   \   /     / \          / \  |-( )
        =C========C==_| ) |--------| ) _/==] _-{_}_)
         \_\_/__..  \_\_/_ \_\_/ \_\_/__.__. $RESET
    """.trimIndent();

    println(asciiArt);
}

fun main() {
    printAsciiArt();
    println("$BLUE_BOLD \n Escull el número de la opció de la teva VW Califòrnia: $RESET")
    println("$GREEN_BOLD 1- Grand Califòrnia")
    println(" 2- Califòrnia Full Equip")
    println(" 3- Sortir $RESET")

    do {
        val modelCalifornia = readln().toInt()

        var precio = getPriceByModel(modelCalifornia);

        println("$BLUE_BOLD Indica'm els km dels teus pneumàtics")
        val kilometrosNeumaticos= readln().toLong()

        precio = calcularEstatPneumatics(kilometrosNeumaticos, precio)

        println("$BLUE_BOLD Indica'm si disposa de portabicis")
        val portabicis = readln().toBoolean()

        precio = getPriceByPortabicis(portabicis, precio)

        println("$BLUE_BOLD Indica'm els anys del vehicle")
        val anysVehicle = readln().toInt()

        println("$BLUE_BOLD Indica´m els quilòmetres del vehicle")
        val kmVehicle = readln().toLong()

        precio = getPriceByYearsKm(anysVehicle, kmVehicle, precio)

        print("$BLUE_BOLD El preu final del vehicle és: $precio")
    }while (modelCalifornia !=3)

}