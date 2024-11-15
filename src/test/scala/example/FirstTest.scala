package com.snailmusk.concepts
import org.scalatest._,  wordspec._, matchers._


class FirstTest  extends AnyWordSpec with should.Matchers :
  "First test" should {"work" in {
     5 should be(5)
  }}


  