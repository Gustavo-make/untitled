package Controlers

import Entities.Booking
import Entities.Clients
import Entities.Rooms
import Printer

class BookingControler {
    private val printer = Printer()
    private val bookingslist: MutableList<Booking> = mutableListOf()
    fun assBooking(clients: Clients, room: Rooms) {
        printer.printMsg("Ingrese el numero de noches")
        val totalNights = readln().toInt()
        printer.printMsg("Ingrese la fecha de inicio")
        val checkInDate = readln()
        printer.printMsg("Ingrese la fecha de salida")
        val checkOutDate = readln()
        printer.printMsg("Ingrese la cantidad de personas")
        val clientPax = readln()
    }
}