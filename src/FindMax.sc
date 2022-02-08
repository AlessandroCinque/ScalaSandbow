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