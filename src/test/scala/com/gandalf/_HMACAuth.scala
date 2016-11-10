package com.gandalf

import org.scalatest.FunSpec

class HMACAuthTest extends FunSpec {
  describe("HMACAuth") {
    it("should return true if the token can be decoded to key") {
      val token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.MTA.7o1O0yQJOIZ16Mtbs1OCm2j74d9NNYN6_1xDJ2AuJPg"
      val secret = "secret"
      val key = "10"
      assert(HMACAuth.validateHost(token, key, secret) == true)
    }

    it("should return false if the token cannot be decoded to key") {
      val token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.MTA.7o1O0yQJOIZ16Mtbs1OCm2j74d9NNYN6_1xDJ2AuJPg"
      val secret = "secret"
      val key = "1"
      assert(HMACAuth.validateHost(token, key, secret) == false)
    }
  }
}