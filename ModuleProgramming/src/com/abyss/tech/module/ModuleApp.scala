package com.abyss.tech.module

/**
 * @author Leonardo
 */
object ModuleApp extends App {
  import com.abyss.tech.module._
  import com.abyss.tech.domain._
  object SimpleBrowser extends Browser{
  val db = SlimDatabase  
  def displayAllReciepts = db.displayAllReciepts
  }
  
  Console.println(SimpleBrowser.db.findReciepts(Lamb))
}