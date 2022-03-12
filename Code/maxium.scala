object Class {
    def main(args: Array[String]) = {
       println("the maximum betwwen 10 and 11 is : ")
       println(maxNumber(10, 11))

      }

      def maxNumber(number1:Int, number2:Int) = {
          if (number1 > number2) number1
          else  number2
      }

      


}