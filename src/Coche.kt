class Coche():EncendidoApagado,Vehiculo {

    override var motorencendido: String = "apagado"
    override var kmHora: Int = 0

    override fun encender(){
        if (motorencendido == "apagado"){
            motorencendido = "encendido"
        }else{
            println("El motor ya esta encendido")
        }
    }

    override fun apagar(){
        if (motorencendido == "encendido"){
            motorencendido = "apagado"
        }else{
            println("El motor ya esta apagado")
        }
    }

    override fun acelerar(km: Int) {
        if (motorencendido == "encendido"){
            kmHora += km
        }else{
            println("Para acelerar primero tienes que encender el motor cacho bestia!!")
        }
    }

    override fun frenar(km: Int) {
        if (motorencendido == "encendido"){
            kmHora -= km
        }else{
            println("Para frenar primero tienes que encender el motor lunatico!!")
        }
        if (kmHora < 0){kmHora = 0}
    }
}