import kotlin.math.abs

class Test{

}

fun Any.println(){
    println(this)
}
fun main() {
//    var a = 1
//    var y = a
//    a.println()
//    y.println()
//
//    "----------------------------".println()
//
//    a+=1
//    a.println()
//    y.println()

    var a = 1234
    var b = a
    var c = a

    (c===b).println()
    (c==b).println()

    (2.0%1).println()
}
