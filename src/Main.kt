
interface EncendidoApagado{

    fun encender()

    fun apagar()
}

interface DispositivoElectronico{
    fun reiniciar()
}

interface Vehiculo{

    var motorencendido: String

    var kmHora: Int

    fun acelerar(km: Int)

    fun frenar(km: Int)
}

fun main(){

    val cochecitoLere = Coche()

    //TODO Pruebas errores
    cochecitoLere.apagar()
    cochecitoLere.frenar(12)
    cochecitoLere.acelerar(70)

    //TODO Funcionamiento
    cochecitoLere.encender()
    cochecitoLere.frenar(12)
    cochecitoLere.acelerar(70)
    cochecitoLere.frenar(20)
    cochecitoLere.apagar()
}