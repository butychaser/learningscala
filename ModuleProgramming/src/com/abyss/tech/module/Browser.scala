package com.abyss.tech.module

/**
 * @author Leonardo
 */
abstract class Browser {
  import com.abyss.tech.domain._
  val db:Database
  def displayAllReciepts
}