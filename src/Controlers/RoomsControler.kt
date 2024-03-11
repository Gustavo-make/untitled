package Controlers

import Entities.Rooms
import Printer

class RoomsControler {
    private val roomlist: MutableList<Rooms> = mutableListOf()
    private val printer = Printer()

    fun registerRoom() {
        printer.printMsg("Ingrese el numero de habitacion")
        val numRoom = readln().toInt()
        printer.printMsg("Seleccione el tipo de habitacion")
        val type = readln()
        printer.printMsg("Ingrese le precio por noche")
        val priceNight = readln().toDouble()
        printer.printMsg("Ingrese el pax maximo de la habitacion")
        val capacity = readln().toInt()
        val room = Rooms(numRoom, type, priceNight, capacity)
        roomlist.add(room)

    }

    fun showRooms() {
        if (roomlist.isEmpty()) {
            printer.printMsg("No hay habitaciones registradas")
        } else {
            var counter = 1
            for (client in roomlist) {
                printer.printMsg("$counter" + client.getRoomData())
            }
        }
    }
    fun modifyRoom(modifiedRoom: Rooms, index: Int) {
        roomlist[index] = modifiedRoom
    }
}