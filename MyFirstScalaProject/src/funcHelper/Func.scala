package funcHelper
import java.io.File
import scala.io.Source
import scala.io.Codec



object Func {
  
  def equalTwoStrings(word1:String , word2:String):Boolean = {
    
    if(word1.equals("")  && word2.equals(""))
       true    
    else if(word1.length != word2.length || (!word1.charAt(0).equals(word2.charAt(0))))
       false
   
    else
      equalTwoStrings(word1.substring(1),word2.substring(1)) 
       
       
  }
  
  def printReut = println("I love opoi")
  
  def printFile(nameFile:String) = {
     
      require(new File(nameFile).exists())
       val lines =  Source.fromFile(nameFile)
      
      
  }
  
  def printContentOfURL(url:java.net.URL) = {
      val lines =  Source.fromURL(url){Codec.UTF8}.getLines()
          lines.foreach(println) 
      
       
  }
  
  
}