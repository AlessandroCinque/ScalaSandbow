object printTest
{
    def main(arg: Array[String])=
    {
        val myChar = "*"
        val base = 5

        //"manual"
        Pyramid(base,myChar)
        //regular
        for (i <-1 to base)println(myChar * i)
        //reverse
        for (i <-base to 1 by -1)println(myChar * i)
    }
// TO NOTICE! I tried first with a char but instead of printing x times it was MULTIPLYING x with the CHAR VALUE (the bit)!!!
    def Pyramid(x:Int, aChar : String): Unit=
    {
        if (x == 0) println("done")
        else
        {
            println(aChar * x)
            Pyramid(x-1, aChar)
        }
    }
}


