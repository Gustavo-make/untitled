package Entities

abstract class Rooms (
    val numRoom: Int,
    val type: String,
    val occupied: Boolean = false,
    val priceNight: Double,
    val clean: Boolean = true,
    val capacity: Int
    ) {
     fun getRoomData(): String {
         return "Numero: $numRoom Capacidad: $capacity Tipo: $type Esta limpio $clean Esta en uso $occupied "
     }


}