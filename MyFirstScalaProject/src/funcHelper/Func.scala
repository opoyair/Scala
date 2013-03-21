package funcHelper

object Func {
  
  def equalTwoStrings(word1:String , word2:String):Boolean = {
    
    if(word1.equals("")  && word2.equals(""))
       true    
    else if(word1.length != word2.length || (!word1.charAt(0).equals(word2.charAt(0))))
       false
   
    else
      equalTwoStrings(word1.substring(1),word2.substring(1)) 
       
       
  }
  
  def printReut() = println("I love popi")

}