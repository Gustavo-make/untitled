package Entities

import Entities.Rooms

class Suite (
    numRoom: Int,
     type: String,
    occupied: Boolean,
     priceNight: Double,
     clean: Boolean,
     capacity: Int,
    val hasJacuzzi: Boolean
): Rooms(numRoom, type, occupied, priceNight, clean, capacity)  {
}