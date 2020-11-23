class V {
  public static void main(String[] a) {
    int c = 10, i = -1, j = 0;
    String s = "";
    while (j++ < c) s += " ";
    s += "*";
    while (++i < c) {
      for (j = -2; ++j < c - i; ) s += " ";
      for (j = 0; ++j < 2 * i; ) s += "0";
      System.out.println(s);
      s = "";
    }
  }
}
