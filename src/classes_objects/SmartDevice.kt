package classes_objects

open class SmartDevice protected constructor (val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

    open val deviceType = "unknown"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when(statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    open fun turnOn() {
        deviceStatus = "on"
        println("Smart device is turned on.")
    }

    open fun turnOff() {
        deviceStatus = "off"
        println("Smart device is turned off.")
    }

    open fun printDeviceInfo() {
        println("name=$name\tcategory=$category\ttype=$deviceStatus")
    }
}