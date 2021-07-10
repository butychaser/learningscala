package com.abyss.tech.extract

/**
 * @author Leonardo
 */
object ProstitutePositionApp extends App {
  val str = "Lily,missionary"
  val (name,service) = str match{
    case ProstituteAction(alias,position) => (alias,position)
    case _ =>("Wrong hooker", "Wrong service")
  }
  
  Console.println(s"${name}:${service}")
}