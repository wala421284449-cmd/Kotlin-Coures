//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Question 1
    println("Enter your name")
    val name = readln()
    println("Enter your color")
    val color = readln()
    println("Hello $name ! I see your favorite color is $color")

    //Question 4
    println("Enter the number")
    val number=readln().toInt()
    if (number %2==0){
        println("The $number is an even number")
    }else{
        println("The $number is an odd number")
    }

    //Question 5
    println("Enter the input")
    val input=readln()
    val reversed=input.reversed()
    println("Reversed $reversed ")



    //Question 6
    for (i in 1..100){
        if (i %3==0 && i%5==0){
            println("FizzBuzz")
        } else if  (i%5==0) {
            println("Buzz")
        }else if (i%3==0){
            println("Fizz")
        }
    }


    //Question 7
    println("Enter a number")
    val  num=readln().toInt()
    var sum=0
    for (i in 1..num){
        sum +=i
    }
    println("The sum of numbers from 1 to $num is ${sum}")
    println("WALAA")
}