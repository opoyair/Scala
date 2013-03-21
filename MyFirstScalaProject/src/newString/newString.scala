package newString

class newString(value:String*) {
   
    def myForEach[B](func:(java.lang.String)=>B) = {
      for(va <- value)
        func(va)
    }
    
    def newExists(f:(java.lang.String) =>Boolean):Boolean = {
      val l =for { 
          va <- value 
          if f(va)         
         } yield va
      if(l.isEmpty) false else true
    }
    
    //def length(len:String):Int= len.length() 
    
    

}