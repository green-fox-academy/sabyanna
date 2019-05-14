public class NumberConverter {
  String stringNumber;

  public static String[] ones = {
          "", "one", "two", "three", "four",
          "five", "six", "seven", "eight",
          "nine", "ten", "eleven", "twelve",
          "thirteen", "fourteen", "fifteen",
          "sixteen", "seventeen", "eighteen",
          "nineteen"
  };

  public static String[] tens = {
          "",          // 0
          "",          // 1
          "twenty",    // 2
          "thirty",    // 3
          "forty",     // 4
          "fifty",     // 5
          "sixty",     // 6
          "seventy",   // 7
          "eighty",    // 8
          "ninety"     // 9
  };

  public String convert(int number) {
    stringNumber = String.valueOf(number);
    String result = "";

    /*
    if (10 < number % 100 && number % 100 < 19) {
      result = ones[number % 100];
    }
     */
    if (number > 19) {
      result = ones[getIntIndex(0)];
      if (stringNumber.length() > 1) {
        if ()
        result = tens[getIntIndex(1)];
      }

    } else {
      result = ones[number];
    }



    result =

    /*

    if (number > 19) {
      if (number % 10 != 0) {
        result = tens[number / 10] + "-" + result;
      } else if (number < 99){
        result = tens[number / 10];
      }


      if (number > 99 && number < 1000) {
        if (number % 100 != 0) {
          result = ones[getIntIndex(2)] + " hundred and " + result;
        }
      }


    }

     */

    return result;


  }

  public int getIntIndex(int place) {
    String sub = stringNumber.substring(stringNumber.length() - place - 1, stringNumber.length() - place);
    return Integer.valueOf(sub);
  }

  public boolean checkZeros(int index) {
    int sum = 0;
    for (int i = index + 1; i < stringNumber.length()-1; i++) {
      sum += Integer.valueOf(stringNumber.substring())
    }
  }

}
