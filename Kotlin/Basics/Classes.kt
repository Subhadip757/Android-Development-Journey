
class Person(var name: String, var age: Int){
    lateinit var profession: String;

    fun canVote(age: Int){
        if(age < 18 && age >= 16){
            println("Cannot Vote");
        }
        else if(age < 16){
            println("Try after 18 years old")
        }
        else{
            println("Can vote");
        }
    }

    fun limit(nameLen: Int){
        when(nameLen){
            10 -> println("Perfect");
            8 -> println("Strong");
            else -> println("Weak")
        }
    }
}

fun main(){

    //object of the class
    var name: String="Subhadip";
    var age: Int = 8;

    var p1 = Person(name, age);

    p1.limit(10);
    p1.canVote(age);
}