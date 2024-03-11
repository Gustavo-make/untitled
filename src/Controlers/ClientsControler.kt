package Controlers

import Entities.Clients
import Printer

class ClientsControler(
) {
    private val clientsList: MutableList<Clients> = mutableListOf()
    private val printer = Printer()

    fun registerClient() {

        printer.printMsg("Ingresa el nombre del cliente")
       val name = readln()
        printer.printMsg("Ingrese la edad del cliente")
        val age = readln().toInt()
        printer.printMsg("Ingrese el apellido del cliente")
        val lastName = readln()
        printer.printMsg("Es socio del club vacacional?")
        val timeShare = readln().toBoolean()
        printer.printMsg("Ingrese el celular del cliente")
        val cellphone = readln().toInt()
        printer.printMsg("Ingrese la direccion del cliente")
        val address = readln()
        val client = Clients(name, age, lastName, timeShare, cellphone, address)
        clientsList.add(client)
    }
    fun showClients() {
        if (clientsList.isEmpty()){
            printer.printMsg("No hay clientes registrados")
        } else {
        var counter = 1
        for (client in clientsList) {
            printer.printMsg("$counter" + client.getClientData())
        }
        }
    }
    fun deleteClients(index: Int) {}
    }