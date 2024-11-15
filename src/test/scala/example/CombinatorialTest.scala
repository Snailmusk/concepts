package com.snailmusk.concepts
import org.scalatest._,  wordspec._, matchers._
import com.snailmusk.concepts.Factorial.factorial


object Factorial :
   def factorial(i:Int):Int = 
      (1 to i).foldLeft(1){(a,b) => a*b}

   def choose (total:Int, choose:Int) :Int  = 
      factorial(total) / factorial(choose)



   
import Factorial.*

class CombinatorialTest  extends AnyWordSpec with should.Matchers :
   "Factorial" should {"work" in {
     factorial(4) should be ( 24)
     factorial(3) should be(6)
     factorial(2) should be (2)
     
  }
  "5 choose 3" should {"be 20" in {
    choose(5,3) should be(20)


  }}

}

