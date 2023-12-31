/*

Please extend our example of the MobilePhone class with

class MobilePhone(osName: String, brand: String, model: String){
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
}
Add a member to it, which indicates how much battery is left (call it "battery". Initialize this value with a number between 0 and 50.

Then add a function
"chargeBattery"
Which needs details about how much was charged.

It should print out how much battery the phone had before, how much was charged and how much it has now.
Create an Object of the class and call this function. Charge the battery by 30.

*/

/*
* Solution: Challenge Classes
* */

// Here is my sample solution for the challenge. Of course, there are many different ways of solving this.

fun main() {
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android", "Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")


    class MobilePhone(osName: String, brand: String, model: String) {

        private var battery = 30

        init {
            println("The phone $model from $brand uses $osName as its Operating System")
        }

        fun chargeBattery(chargedBy: Int) {
            println("Battery was at $battery and is at ${battery + chargedBy} now")
            battery += chargedBy
        }
    }
}
