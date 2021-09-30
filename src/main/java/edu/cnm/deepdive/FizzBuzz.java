package edu.cnm.deepdive;

import java.util.EnumSet;

/**
 * Implements a method that computes the FizzBuzz {@link String} for any non-negative integer. This
 * implementation ignores the common form of the FizzBuzz challenge
 */
public class FizzBuzz {



  /**
   * Computes and returns,{@link String} FizzBuzz value for a specified non-negative integer. Return
   * value will be "Fizz", "FizzBuzz", or the string representation of {@code value} depending
   * whether it is divisible by 3, 5, 15, or noneof the above.
   *
   * @param value
   * @return
   */
  public EnumSet<FizzBuzzValue> getFizzBuzz(int value) {
    EnumSet<FizzBuzzValue> valueSet = EnumSet.noneOf(FizzBuzzValue.class);
    // TODO Put appropriate values in valueSet, based on whether a value is divisible by 3 or 5.
    if (value % 3 == 0) {
      valueSet.add(FizzBuzzValue.FIZZ);
      return valueSet;
    }
    if (value % 5 == 0) {
      valueSet.add(FizzBuzzValue.BUZZ);
    }

    return valueSet;

  }

}
