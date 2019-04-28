package dev.tnordquist;

public class LinearIn {

  public static boolean linearIn(int[] inner, int[] outer) {

    int ct = 0;
    int newLength = inner.length;
    if (inner.length < outer.length) {
      for (int i = 0; i < inner.length; ++i) {
        if (i < inner.length - 1 && inner[i] == inner[i + 1]) {
          newLength--;
          continue;
        }
        for (int j = 0; j < outer.length; ++j) {
          if (j < outer.length - 1 && outer[j] == outer[j + 1]) {
            continue;
          }
          if (inner[i] == outer[j]) {
            ct++;
          }

        }

      }
      return (ct == newLength);
    } else {
      newLength = outer.length;
      if (outer.length < inner.length) {
        for (int i = 0; i < outer.length; ++i) {
          if (i < outer.length - 1 && outer[i] == outer[i + 1]) {
            newLength--;
            continue;
          }
          for (int j = 0; j < inner.length; ++j) {
            if (j < inner.length - 1 && inner[j] == inner[j + 1]) {
              continue;
            }
            if (outer[i] == inner[j]) {
              ct++;
            }

          }

        }

      }
      return (ct == newLength);
    }
  }
}