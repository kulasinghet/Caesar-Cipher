object Main {
  def main(args: Array[String]): Unit = {

    def encrypt(text: String, key:Int):String = {
      text.map(c => (
        if (c.isUpper) { // A = 65
          val shift = (c.toInt + key - 65) % 26 + 65 // we take the remainder of the division by 26 to stay in the range of the alphabet and add 65 to get back to the ASCII code
          shift.toChar // we convert the ASCII code to a character
        }
        else { // a = 97
          val shift = (c.toInt + key - 97) % 26 + 97 // we take the remainder of the division by 26 to stay in the range of the alphabet and add 97 to get back to the ASCII code
          shift.toChar
        }))}


    println("AZaz is encrypted as "+encrypt("AZaz", 1))

    def decrypt(text: String, key:Int): String = {
      encrypt(text, 26 - key) // since caesar cipher is a simple substitution cipher, the decryption is the same as the encryption with the key shifted by 26 - key
    }

    println("BAba is decrypted to "+decrypt("BAba", 1))
  }
}