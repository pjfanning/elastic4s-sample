package com.example.elastic4s

object Encoder {
  private val VALUES = "!#$&'()*+,/:;=?@[] \"%-.<>\\^_`{|}~"

  def encode(input: String): String = {
    if (input == null || input.isEmpty) {
      input
    } else {
      val result = new StringBuilder(input)
      var i = input.length - 1
      while ( {
        i >= 0
      }) {
        if (VALUES.indexOf(input.charAt(i)) != -1) result.replace(i, i + 1, "%" + Integer.toHexString(input.charAt(i)).toUpperCase)

        {
          i -= 1;
          i + 1
        }
      }
      result.toString
    }
  }
}
