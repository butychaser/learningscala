package com.abyss.tech.extract

/**
 * @author Leonardo
 */
case class ProstituteAction()

object ProstituteAction{
  def unapply(input:String):Option[(String,String,String)] = 
  {
    val index = input.indexOf(",")
    if(index == -1) None
    else
    {
      Some(input.substring(0, index), input.substring(index+1,input.length), "aaa")
    }
  }
}