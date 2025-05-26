fun main(){
    var arr = arrayOf(1, 2, 3, 4, 5, "Subhadip", true, 10.5);

    var arr2 = arrayOf<Long>(100000000, 800000, 98273241, 512345153);

    arr2.set(0, 11);

    arr2[1] = 10;

    for(it in arr2){
        println(it);
    }

    println("Value at 0th index in arr2: " + arr2.get(0));

    for(it in arr){
        println(it);
    }
}