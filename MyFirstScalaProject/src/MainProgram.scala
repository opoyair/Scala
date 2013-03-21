import Mix.ElementJava
import funcHelper.Func
import newString.newString

object MainProgram {
  val l = List("yair", "yaniv", "yael","yair")
  val nums = Array(1, 2, 3, 4, 5)
  def main(args: Array[String]) = {
      
    // val list =  l.remove(_.length()==4)  
   // val e:ElementJava = new ElementJava()
   // e.checkWithJava()
    
   // println(Func.equalTwoStrings(l(0),l(3)))
   
    val ll = new newString("yair","yaniv")

   ll.myForEach(println);
    
   println(ll.newExists(_.equals("")))
   println(ll.newExists(_.length() % 2 == 1))
   // println("xx")
  }

}
