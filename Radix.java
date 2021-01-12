public class Radix{

  public static int nth(int n, int col){
    n = Math.abs(n);
    for (int i = 0; i < col; i++) {
      n = n/10;
    }
    n = n%10;
    return n;
  }

  public static int length(int n){
    n = Math.abs(n);
    String str = Integer.toString(n);
    return str.length();
  }

  public static void merge(MyLinkedList original, MyLinkedList[]buckets){
    for (int i = 0; i < buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }

}
