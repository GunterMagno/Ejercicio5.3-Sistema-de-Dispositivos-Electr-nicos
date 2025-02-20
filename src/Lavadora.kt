class Lavadora: EncendidoApagado{

    var estado = "apagado"

    override fun encender() {estado = "encendido"}

    override fun apagar() {estado = "apagado"}
}