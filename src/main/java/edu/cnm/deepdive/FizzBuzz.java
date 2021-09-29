package edu.cnm.deepdive;

/**
 * Implements a method that computes the FizzBuzz {@link String} for any non-negative integer. This
 * implementation ignores the common form of the FizzBuzz challenge
 */
public class FizzBuzz {

  static final String FIZZ_BUZZ_VALUE = "FizzBuzz";
  static final String FIZZ_VALUE = "Fizz";
  static final String BUZZ_VALUE = "Buzz";

  /**
   * Computes and returns,{@link String} FizzBuzz value for a specified non-negative integer. Return
   * value will be "Fizz", "FizzBuzz", or the string representation of {@code value} depending
   * whether it is divisible by 3, 5, 15, or noneof the above.
   *
   * @param value
   * @return
   */
  public String getFizzBuzz(int value) {
    String str;

    if (value % 3 == 0) {
      if (value % 5 == 0) {
        str = FIZZ_BUZZ_VALUE;
      } else {
        str = FIZZ_VALUE;
      }

    } else if (value % 5 == 0) {
      str = BUZZ_VALUE;
    } else {
      str = String.valueOf(value);
    }

    return str;

  }

}
