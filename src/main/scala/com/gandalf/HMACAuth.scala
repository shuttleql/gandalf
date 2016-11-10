package com.gandalf

import pdi.jwt.Jwt;
import pdi.jwt.JwtAlgorithm;
import scala.util.Success
import scala.util.Failure

object HMACAuth {
  def validateHost(token: String, key: String, secret: String) : Boolean = {
    Jwt.decode(token, secret, Seq(JwtAlgorithm.HS256)) match {
      case Success(value) => 
        value == key
      case Failure(ex) => 
        false
    }
  }
}