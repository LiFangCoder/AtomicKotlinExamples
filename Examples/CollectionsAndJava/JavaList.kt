// CollectionsAndJava/JavaList.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3)
  (list is java.util.List<*>) eq true
}
