package classes_objects

class SmartLightDevice(deviceName: String, category: String):
    SmartDevice(deviceName, category) {

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulator(2, minValue = 0, maxValue = 100)

    fun increaseBrightness() {
        brightnessLevel++
        println("brightness level: $brightnessLevel")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }

    fun decreaseBrightness() {
        brightnessLevel--
    }
}