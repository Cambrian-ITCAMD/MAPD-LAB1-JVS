/*
Jay Patel    : A00254220 
Viren Moliya : A00245404
Smith Parekh : A00241603
*/

fun main() {
    println("Creating a default d6...")
    var default = Dice()

    print("\nCreating a d")
    var userSide:Int = readln().toInt()
    var d20 = Dice(userSide)

    print("\nPlease enter name:")
    var userName:String = readln()
    print("Please enter sides:")
    var userSideDice2:Int = readln().toInt()
    println("\nCreating $userName dice (a special sides $userSideDice2)...")
    var percentile = Dice(userName, userSideDice2)
    
    println("The current side up for " + default.getName()+" is "+ default.getSideIsUp()) 
    println("The current side up for " + d20.getName() + " is " + d20.getSideIsUp()) 
    println("The current side up for " + percentile.getName() + " is " + percentile.getSideIsUp()) 

    println("\nTesting the roll method\n")

    println("Rolling the " + default.getName() + "...")
    println("The new value is " + default.getNewSide())
    println("Rolling the " + d20.getName() + "...")
    println("The new value is " + d20.getNewSide())
    println("Rolling the " + percentile.getName() + "...")
    println("The new value is " + percentile.getNewSide())

    println("\nSetting the " + d20.getName() + " to show 20...")
    d20.setSide()
    println("The side up is now " + d20.getSideIsUp())
    
    println("\nCreating 5 d6...")

    var dice1 = Dice()      //creating 5 default d6 dices
    var dice2 = Dice()
    var dice3 = Dice()
    var dice4 = Dice()
    var dice5 = Dice()

    var attemp:Int = 0
    var desiredSide:Int = 5
    while (dice1.getNewSide() != desiredSide  ||        //while to check the our desirable outcome i.e 5 of a kind
    dice2.getNewSide() != desiredSide ||
    dice3.getNewSide() != desiredSide ||
    dice4.getNewSide() != desiredSide ||
    dice5.getNewSide() != desiredSide
    ){
        attemp++
    }
    println("YAHTZEE! It took $attemp rolls")
}