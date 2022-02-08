import scala.annotation.tailrec


def fib(acc: Int): Int = {
    @tailrec
    //Here we enter first a and then b
    def fib_tail(acc: Int, a: Int, b: Int): Int =
        acc match {
            //this is the end condition
            case 0 => a
            //here INSTEAD we pass first b (which replaces a) and then the sum of a +b
            //BEFORE all of this of course we decrease the accumulator so that it can meet the end codition above specified
            case _ => println(a) ;fib_tail(acc - 1, b, a + b)
        }
    return fib_tail(acc, 0 , 1)
}
println(fib(10))