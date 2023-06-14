fun f(): Long {
    return -1
}

fun g(): Long {
    return 0xffffffff
}

fun main() {
    println(f())
    println(g())

    println( -1.plus(2) ) // prints '-3'
    println( (-1).plus(2) ) // prints '1'
}
