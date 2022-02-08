import scala.annotation.tailrec

def MyReverse(list: List[String]): List[String] =
{

    def helper(list1: List[String], acc: Int): List[String]=
    {
        println(acc)
        if (list1 == Nil) Nil
        else
        {
            val temp = list1.tail ::: List(list1.head)
            println(temp)
            helper(temp, acc -1)
        }

    }
    val myacc = list.length
    helper(list,myacc)

}
val toReverse = List("cane","infame","Dio","porco","ladro")
val riPorco = MyReverse(toReverse)

println(riPorco)

def reverse[A](l: List[A]): List[A] = l match {
    case h :: tail =>println(reverse(tail) ::: List(h)); reverse(tail) ::: List(h)
    case Nil => Nil
}

val porco2 = reverse(toReverse)
println(porco2)
