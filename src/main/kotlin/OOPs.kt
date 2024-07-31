class Cake{
    var flavour:String= ""
    var quantity:Int =0

}
fun main(){
    var vanilaCake =Cake()
    var chocolateCake =Cake()
    vanilaCake.flavour="vanila"
    vanilaCake.quantity =1

    chocolateCake.flavour = "chocolate"
    chocolateCake.quantity =2

    println(vanilaCake.flavour)

}