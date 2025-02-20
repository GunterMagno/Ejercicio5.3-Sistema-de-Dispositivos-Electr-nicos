class Telefono: EncendidoApagado,DispositivoElectronico{

    var estado = "apagado"

    override fun encender() {estado = "encendido"}

    override fun apagar() {estado = "apagado"}

    override fun reiniciar() {apagar();encender()}
}