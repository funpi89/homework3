package box.kotlin

import java.util.*

fun main(args: Array<String>) {
    var length = 0f
    var width = 0f
    var height = 0
    var scanner = Scanner(System.`in`)
    print("Please enter object's length: ")
    length = scanner.nextFloat()
    print("Please enter object's width: ")
    width = scanner.nextFloat()
    print("Please enter object's height: ")
    height = scanner.nextInt()
    var box3 = Box3()
    var box5 = Box5()
    if (box3.validate(length,width, height)){
        println("Box3")
    }else if (box5.validate(length, width, height)){
        println("Box5")
    }else{
        println("No Box")
    }
}

abstract class Box(){
    abstract fun validate(length : Float, width : Float, height:Int) : Boolean
}

class Box3 : Box() {
    override fun validate(length: Float, width: Float, height: Int) =
        (length <= 23 && width <= 14 && height <= 13)
}

class Box5 : Box() {
    override fun validate(length: Float, width: Float, height: Int) =
        (length <= 39.5 && width <= 27.5 && height <= 23)


}

