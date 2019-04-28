package dev.tnordquist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class LinearInTest {

  private static Object[][] linearIn() {
    return new Object[][]{

        {true, new int[]{2,2,2,2,2}, new int[]{2, 2}}

    };
  }

  @ParameterizedTest
  @MethodSource
  void linearIn(boolean expected, int[] outer, int[] inner) {
    boolean actual = LinearIn.linearIn(outer,inner);
    assertEquals(expected,actual);
  }
}