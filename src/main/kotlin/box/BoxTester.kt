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
    var box3 = Box3(23f,14f,13)
    var box5 = Box5(39.5f,27.5f,23)
    if (box3.validate(length,width, height)){
        println("Box3")
    }else if (box5.validate(length, width, height)){
        println("Box5")
    }else{
        println("No Box")
    }
}

open class Box(val boxlength:Float, val boxwidth : Float, val boxheight:Int){
    fun validate(length : Float, width : Float, height:Int) =
    (length <= boxlength && width <= boxwidth && height <= boxheight)
}

class Box3(boxlength:Float, boxwidth : Float, boxheight:Int) : Box(boxlength,boxwidth,boxheight) {

}

class Box5(boxlength:Float, boxwidth : Float, boxheight:Int) : Box(boxlength,boxwidth,boxheight) {

}

