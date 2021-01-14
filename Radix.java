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

  public static void merge(SortableLinkedList original, SortableLinkedList[]buckets){
    for (int i = 0; i < buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }

  public static void radixSortSimple(SortableLinkedList data){
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for (int i = 0; i < 10; i++) {
      buckets[i] = new SortableLinkedList();
    }
    int longest = 0;
    int digit = 0;
    for (int i = 0; i < data.size(); i++) {
      int num = data.get(i);
      //establishes number of times the process will need to happen
      if (length(num) > longest) {
        longest = length(num);
      }
      //puts everything in buckets
      int index = nth(num,digit);
      buckets[index].add(num);
      data.remove(i);
      i--;
    }
    //data = new SortableLinkedList();
    /*for (int i = 0; i < 10; i++) {//remove this later
      System.out.println(buckets[i].toString());//remove this later
    }*///remove this later
    merge(data,buckets);
    //System.out.println(data.toString());//remove this later
    buckets = new SortableLinkedList[10];
    for (int i = 0; i < 10; i++) {
      buckets[i] = new SortableLinkedList();
    }
    digit+=1;
    //loop for other than 1st digit
    for (int j = 1; j < longest; j++) {
      for (int i = 0; i < data.size(); i++) {
        int num = data.get(i);
        //puts everything in buckets
        int index = nth(num,digit);
        buckets[index].add(num);
        data.remove(i);
        i--;
      }
      //data = new SortableLinkedList();
      merge(data,buckets);
      buckets = new SortableLinkedList[10];
      for (int i = 0; i < 10; i++) {
        buckets[i] = new SortableLinkedList();
      }
      digit+=1;
    }
    //System.out.println(data.toString());//remove this later
    //everything should be sorted
    //DATA CANT' BE NEW
  }

}
