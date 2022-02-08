import scala.annotation.tailrec

def MyReverse(list: List[String]): List[String] =
{

    def helper(list1: List[String], acc: Int): List[String]=
    {
        println(acc)
        if (acc == 0) list1
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
//here explained why this bastard works and mine not...
def reverse(l: List[String]): List[String] = {
    def _reverse(res: List[String], rem: List[String]): List[String] = rem match
    {
            //At a certain point the tail (stored as parameter rem) will run out and it will yield -
            //the empty "list" that we passed it in step 1
        case Nil => res
            //Step 2: the bastard uses :: to split the head from the tail... And adds that head to the empty list in step1
            // and passes the tail (that now is without head again
        case h :: tail => _reverse(h :: res, tail)
    }
    //Step1: we pass an empty "List" and the real list
    _reverse(Nil, l)
}

val porco2 = reverse(toReverse)
println(porco2)

def findMax(x: List[Int]): Int =
{
    def helper(x: List[Int],max: Int): Int = {
        if (x.isEmpty == true) max
        else if(max > x.head) helper(x.tail,max)
        else helper(x.tail,x.head)
    }
    helper(x,0)
}
//
val porcodio = findMax(List(1,2,8,5,6,10,2))
println(porcodio)
