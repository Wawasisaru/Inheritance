fun main(){
    var car = Car("mazda", "x", "black",30)
    car.carry(20)
    car.carry(40)
    car.identity()
    println(car.calculateParkingFees(5))
    var bus = Bus("Toyota","premium", "white",4)
    bus.carry(12)
    bus.identity()
    bus.calculateParkingFees(4)
    println(bus.maxTripFare(arrayOf(200.4, 400.6)))



}
//2. Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus (3 points)
open class Motocar(var make: String, var model: String,var color: String,var capacity: Int) {
    fun carry(people: Int) {

        if (people < 30) {
            println("carrying $people passangers")
        } else {
            var x = people - capacity
            println("overcapacity by $x people")
        }
    }

    fun identity() {
        println("I am a $color $make $model. ")
    }

    fun calculateParkingFees(hours: Int): Int {
        var parkingfees = hours * 20
        return parkingfees
    }
}

class Car(make: String, model: String, color: String, capacity: Int): Motocar(make ,model, color,capacity){

}

//    fun carry(people: Int) {
//
//        if( people < 30){
//            println("carrying $people passangers")
//        }
//        else{
//            var x = people - capacity
//            println ("overcapacity by $x people")
//        }
//    }
//    fun identity(){
//        println("I am a $color $make $model. ")
//    }
//    fun calculateParkingFees(hours: Int): Int{
//        var parkingfees=hours*20
//        return parkingfees
//    }

class Bus(make: String, model: String, color: String, capacity: Int): Motocar(make ,model, color,capacity){
    fun maxTripFare(fare: Array < Double>): Double{
        return fare.max()
    }

}