fun main (){
    var myVariable : Int = 5
    myVariable = 1
    println("the value of variable is : "+myVariable)
    //  the value of variable is : 1

    var myVariable1 : Int = 5

    println("the value of variable is : "+myVariable1)
    //  the value of variable is : 5

    val myVariable2 : Int = 5
//    myVariable2 = 5 // this will return an error as we defined constant values with the help of val keyword
    println("the value of variable is : "+myVariable2)

    var myVariable3 : Boolean = true
    println("the value of variable is : "+myVariable3)
    // the value of variable is : true

    var myVariable4 : Boolean = true
    println("the value of variable is : "+myVariable4)
    // the value of variable is : true
    myVariable4 = false
    println("the value of variable is : "+myVariable4)
    // the value of variable is : false
}
