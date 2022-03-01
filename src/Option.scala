
case class ADodgyDB( dodgyData: Option[Int])
object Option
{
    def main(args: Array[String]) =
    {
        val dodgy1 = ADodgyDB(Some(2))
        val dodgy2 = ADodgyDB(None)
        val dodgy3 = ADodgyDB(Some(-2))

        Datacheker(dodgy2.dodgyData)
        Datacheker(dodgy1.dodgyData)
        Datacheker(dodgy3.dodgyData)
    }

    def Datacheker(x: Option[Int])=
    {
        x match
        {
            //case Some(x) => println(x)
            case x > 0 => println("positive")
            //case x < 0 => println("negative")
            case None => println("Nooope")
        }
    }
}