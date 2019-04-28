package dev.tnordquist;

public class LinearIn {

  public static boolean linearIn(int[] outer, int[] inner) {

    int newJ=0;
    int j;
    int ct = 0;
    int newLength = inner.length;
      for (int i = 0; i < inner.length; ++i) {
        if (i < inner.length - 1 && inner[i] == inner[i + 1]) {
          newLength--;
          continue;
        }
        for (j = newJ; j < outer.length; ++j) {
          if (j < outer.length - 1 && outer[j] == outer[j + 1]) {
            continue;
          }
          if (inner[i] == outer[j]) {
            newJ=j+1;
            ct++;
          }

        }

      }
    return (ct == newLength);
  }

}