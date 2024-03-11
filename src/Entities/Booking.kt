package Entities

import java.security.KeyStore.TrustedCertificateEntry

class Booking (
    val clientPax: Int,
    val clients: Clients,
    val nights: Int,
    val rooms: Rooms,
    val checkInDate: Int,
    val checkOutDate: Int,
    var isCancelled: Boolean = false
){
    private var totalToPay: Double = 0.0
    fun calculateTotalToPay() {
        totalToPay = rooms.priceNight*nights
    }
    fun cancelBooking () {
        isCancelled = true
    }
    fun updateNights(): String {
        return "Nombre del cliente ${clients.getClientData()}"+"Total de noches $nights" +
                "Fecha de entrada $checkInDate" +
                "Fecha de salida $checkOutDate" +
                "Total $totalToPay"

    }    }
