package com.abyss.tech.imply.transcation


/**
 * @author Leonardo
 */
import com.abyss.tech.imply._

object Pimp {
  implicit val cash = MoneyCollect(100)
}