fun main() {
    println( hundred())
    println( friends(arrayOf("Lynet","Ann","Christine","Felix","jemimah")))
    drinks(9)
    println( maths())

}
fun hundred(){
    for (nums in 1..100){
        if (nums % 2 != 0){
            println(nums)
        }
    }
}
fun friends(names:Array<String>):Int {
    var many = 0
    for (name in names)
        if (name.length > 5) {
            many++

        }
    return many

}
fun drinks(age:Int) {
    if (age in 0..6) {
        println("milk")
    } else if (age in 7..14) {
        println("fanta orange")
    } else{
        println("coca cola")
    }
}

fun maths(){
    for (nums in 1..100)
        when{
            nums % 3 == 0 && nums % 5 == 0 -> println("fizzBuzz")
            nums % 3 == 0 -> println("fizz")
            nums % 5 == 0 -> println("Buzz")
            else -> println(nums)


        }


}