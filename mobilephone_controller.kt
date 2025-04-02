/*📱 Mobile Phone Controller (Beginner-Friendly)
Since you wanted to control your mobile phone using Kotlin, let's build a simple Phone Control System.

What will this project do?
Simulate a mobile phone with basic functions.

Allow you to turn on/off WiFi, adjust volume, and check battery status.

🛠 Step 1: Plan the Classes
Think about what real-world objects are involved.

MobilePhone Class → Represents a phone with basic settings.

Functions inside MobilePhone:

toggleWiFi() → Turns WiFi on/off.

adjustVolume(level: Int) → Changes the volume.

checkBattery() → Prints battery percentage.

🚀 Step 2: Your Task
Create a MobilePhone class with:

A property wifiEnabled (Boolean) to track WiFi status.

A property volume (Int) for the volume level.

A property batteryLevel (Int) for battery percentage.

Write methods to toggle WiFi, change volume, and check battery.

In main(), create a MobilePhone object and test these methods. */

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
