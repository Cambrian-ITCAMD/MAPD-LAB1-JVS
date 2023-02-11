/*
Jay Patel    : A00254220 
Viren Moliya : A00245404
Smith Parekh : A00241603
*/

import kotlin.random.Random //for getting random side of the dice

public class Roll (      //roll method to get random side and default side if needed
    sides: Int
) {
    private var sides: Int = sides
    private var sideUp: Int = Random.nextInt(sides) //gives random numbefr of side every time 

    fun getNewSide():Int = this.sideUp      //return new side facing up value
    fun getSide():Int = sides               //return total side value
    constructor(): this(6)
}

class Dice(
    name: String,
    Roll: Roll
) {
    private var name = name
    private var sides: Int = Roll.getSide()     // assigning side value from Roll method
    private var sideUp: Int = Roll.getNewSide() // assigning new side value from Roll method for first time
    
    constructor(
        sides: Int
    ): this("d"+sides, Roll(sides))         //constructor with single argument
    constructor(
        name: String, 
        sides: Int
    ): this(name, Roll(sides))              //constructor with two argument
    constructor(): this("d6", Roll())       //constructor with zero argument

    fun setSide() {                         //sets the max side to side facing up
        sideUp = sides
    }
    fun getName():String = this.name        //returns name of dice
    fun getSides():Int = this.sides         //returns side of dice
    fun getSideIsUp():Int = this.sideUp     //returns side facing up of dice
    fun getNewSide():Int = Roll(sides).getNewSide() //returns new side facing up of dice
}
