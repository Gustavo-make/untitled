package Entities

class Clients  (
    val name: String,
    val age: Int,
    val lastName: String,
    val timeShare: Boolean,
    val cellphone: Int,
    val address: String
    ){
    fun getClientData(): String {
        return "Nombre:$name $lastName celular: $cellphone Direccion: $address Edad: $age Es socio: $timeShare"
    }
}
