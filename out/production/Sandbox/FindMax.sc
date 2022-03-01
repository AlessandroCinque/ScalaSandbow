
val toFind = List(1,2,8,5,6,10,2,9,100,99)
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
val porcodio = findMax(toFind)
println(porcodio)
def find2Max(x:List[Int],max: Int):Int =
{
    def helper(x1:List[Int],max1: Int,max2:Int):Int =
    {
        if (x1.isEmpty == true) max2
        else if (x1.head < max1 && x1.head > max2)
        {
            helper(x1.tail,max1,x1.head)
        }
        else
        {
            helper(x1.tail,max1,max2)
        }


    }
    helper(x,max,0)

}

println(find2Max(toFind,findMax(toFind)))