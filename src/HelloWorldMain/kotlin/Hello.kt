package sample.helloworld

fun hello(): String {
  return "Hello, Kotlin/Native!"
}

data class Product(val name: String, val price: Double /*USD*/)

fun selector(p: Product): Double = p.price

fun main(args: Array<String>) {

    val list = ArrayList<String>()

    list.add("Z")
    list.add("A")
    list.add("B")
    list.add("Aaa")
    list.add("X")
    list.add("Aa")

    list.sort()

    list.onEach{
        println(it)
    }

    list.forEachIndexed{
        i, e -> println("list[$i] = $e")
    }

    val products = arrayOf(
            Product("iPhone 8 Plus 64G", 850.00),
            Product("iPhone 8 Plus 256G", 1100.00),
            Product("Apple iPod touch 16GB", 246.00),
            Product("Apple iPod Nano 16GB", 234.75),
            Product("iPad Pro 9.7-inch 32 GB", 474.98),
            Product("iPad Pro 9.7-inch 128G", 574.99),
            Product("Apple 42mm Smart Watch", 284.93)
    )

    products.sortByDescending({selector(it)})

    products.forEachIndexed{
        i, it -> println("$i = ${it.price} ${it.name}")
    }


}



