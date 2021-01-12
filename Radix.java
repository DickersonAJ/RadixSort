public class Radix{

  public static int nth(int n, int col){
    for (int i = 0; i < col; i++) {
      n = n/10;
    }
    n = n%10;
    return n;
  }

  public static int length(int n){
    String str = Integer.toString(n);
    return str.length();
  }

}
