package com.abyss.tech.factory

/**
 * @author Leonardo
 */
trait Element {
  def contents:Array[String]
  def width:Int
}
class ArrayElement(override val contents:Array[String]) extends Element{
  override val width:Int = contents.length
}

class LineElement(val contentString:String) extends Element{
  override val contents = Array(contentString)
  override def width:Int = contentString.size
  val height:Int = 1
}


object Element{
  def elem(contents:Array[String]):Element = new ArrayElement(contents)
  def elem(contents:String):Element = new LineElement(contents)
}