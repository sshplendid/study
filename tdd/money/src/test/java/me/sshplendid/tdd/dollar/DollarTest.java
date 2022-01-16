package me.sshplendid.tdd.dollar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DollarTest {

  @Test
  @DisplayName("$5 * 2 = $10")
  void testMultiplication() {
    // GIVEN
    Dollar five = new Dollar(5);

    // WHEN
    five.times(2);

    // THEN
    assertEquals(10, five.amount);
  }
}
