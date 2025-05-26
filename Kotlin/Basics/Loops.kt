fun main(){
    var i: Int = 1;

    while(i <= 5){
        print("$i ")
        i++;
    }

    println();

    for(i in 1..5){
        print("$i ");
    }

    println();
    var name: String = "Subhadip";

    for(it in name){
        print("$it ")
    }
}