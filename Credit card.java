public class CreditCardValidator {

  public static void main(String[] args) {

    String input = "4388576018402626";
    System.out.println(CreditCardValidatorNumber(input));
  }

  private static boolean CreditCardValidatorNumber (String input) {

    // Convert input to int
    int[] creditCardInt = new int[input.length()];

    for (int i = 0; i < input.length(); i++) {
      creditCardInt[i] = Integer.parseInt(input.substring(i, i + 1));
    }
    
    // Starting from the right, double each other digit, if greater than 9 mod 10, and + 1 to the remainder
    for (int 1 = creditCardInt.length - 2; i >= 0; i = i - 2) {
      int tempValue = creditCardInt[i];
      tempValue = tempValue * 2;
      if (tempValue > 9) {
        tempValue = tempValue % 10 + 1;
      }
      creditCardInt[i] = tempValue;
    }
    
    // Add all up to digits
    int total = 0;
    for (int i = 0; i < creditCardInt.length; i++) {
      total += creditCardInt[i];
    }
    
    // If the number is a multiple of 10, it is valid
    return (total % 10 == 0);
  }
}
