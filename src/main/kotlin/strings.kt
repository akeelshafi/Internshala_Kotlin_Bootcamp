fun main(){
    var str ="akeel shafi  kana"

    val length = str.length
    println(length)

    val getIndex = str.get(6)
    println(getIndex)

    var getSubstring = str.substring(6,11)
    println(getSubstring)

    var upperCase = str.toUpperCase()
    println(upperCase)

    var lowerCase = str.toLowerCase()
    println(lowerCase)

    var  trimedStr= str.trim()
    println(trimedStr)

    var strContains = str.contains("akeel")
    println(strContains)

    var strReplace = str.replace("a","s")
    println(strReplace)

    var strSplit = str.split(",")
    println(strSplit)

    println("\$internshala")
}