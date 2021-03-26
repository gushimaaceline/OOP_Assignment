fun main() {
var person= Human("Celine",22,59.toFloat())
    person.eat(2)
person.speak("I love Kotlin world")
    person.birthday()
    var userPerson=User("Abella","Gushima","celinegushinaa@gmail.com","+250781405420","Gu781405@!")
    println(userPerson.email)
    println(userPerson.password)
}
class Human(var name:String,var age:Int,var weight:Float){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight=weight+foodWeight
        println(weight)
        }
    fun speak(speech:String){
       println(speech)
    }
    fun birthday(){
        age=age+1
        println(age)
    }
}

data class User(val firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String)