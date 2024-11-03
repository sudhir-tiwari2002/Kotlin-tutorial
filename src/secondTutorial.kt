fun main(){
    var x = 15   // we can create a variable without defining data type as well
    val y = 10

    val result = x+y
    println(result) // 25
    print("the result of x + y is : ${x+y}") /* if we want to print the calculation value of the variable then we need to pass the value into the curie brackets */

    val result2 = x*y
    println(result2) // 150

    println(x-y) // 5

    println(x/y) // 1

    println(x%y) // 5

    x+=10   // expression is considered as x= x+10
    println(x)  // 25

}