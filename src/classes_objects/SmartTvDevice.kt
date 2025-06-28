package classes_objects

class SmartTvDevice(deviceName: String, category: String):
    SmartDevice(name = deviceName, category = category) {

    override val deviceType = "Smart TV"


    private var speakerVolume by RangeRegulator(2, minValue = 0, maxValue = 100)
    private var channelNumber by RangeRegulator(1, minValue = 0, maxValue = 200)

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    fun decreaseVolume() {
        speakerVolume--
    }

    fun previousChannel() {
        channelNumber--
    }

    override fun turnOn() {
        deviceStatus = "on"
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        deviceStatus = "off"
        println("$name turned off")
    }
}