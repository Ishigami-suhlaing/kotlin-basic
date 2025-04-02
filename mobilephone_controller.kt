class MobilePhone(var wifiStatus:Boolean,var volumeLevel:Int,var batteryStatus:Int){
    //to turn on and off wifiStatus variable
    fun toggleWifi(){
        println("Wifi is ${if(wifiStatus) "ON" else "OFF"} initially");
        wifiStatus = !wifiStatus;
        println("WiFi is now ${if (wifiStatus) "ON" else "OFF"}")
    }


    //to adust volume
    fun adjustVolume(change: Boolean, amount: Int){
        if(change){
            volumeLevel = (volumeLevel + amount).coerceAtMost(100);
        }else{
            volumeLevel = (volumeLevel - amount).coerceAtLeast(0);
        }
    println("volume is $volumeLevel");
    }

    fun showBatteryPercentage(){
        println("You battery is $batteryStatus%");
    }


}

fun main() {
    println("Hello Coder!")
    val mobilePhone:MobilePhone = MobilePhone(true, 45, 68);
    mobilePhone.toggleWifi();
    mobilePhone.adjustVolume(false, 35);
    mobilePhone.showBatteryPercentage();
}