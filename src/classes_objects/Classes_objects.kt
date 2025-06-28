package classes_objects

class Classes_Objects() {
    fun main() {

        var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
        smartDevice.turnOn()

        smartDevice = SmartLightDevice("Google Light", "Utility")
        smartDevice.turnOn()
    }
}