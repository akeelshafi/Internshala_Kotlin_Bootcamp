fun main(){
//    calculateArea(20,5)
//    calculateVolume(10,5,7)

   /* repeat(5){
      println(10)
    }
*/
    println("please enter your name : ")

    val  name = readlnOrNull()
    println("hello $name! welcome here")

}



fun calculateArea(length:Int,width:Int){
    val area = length*width
    println("The area of Rectangle is : $area")
}

fun calculateVolume(length: Int,width: Int,height:Int){
    val volume = length*width*height

    println("The volume of cube is : $volume")

}


