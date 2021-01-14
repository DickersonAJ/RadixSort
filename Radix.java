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

  /*public static void merge(MyLinkedList original, MyLinkedList[]buckets){
    for (int i = 0; i < buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }*/

  public static void merge(SortableLinkedList original, SortableLinkedList[]buckets){
    for (int i = 0; i < buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }
  public static void mergeReverse(SortableLinkedList original, SortableLinkedList[]buckets){
    for (int i = buckets.length-1; i >= 0; i--) {
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
      int num = data.remove(i);
      //establishes number of times the process will need to happen
      if (length(num) > longest) {
        longest = length(num);
      }
      //puts everything in buckets
      buckets[nth(num,digit)].add(num);
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
        int num = data.remove(i);
        //puts everything in buckets
        buckets[nth(num,digit)].add(num);
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

  public static void radixSort(SortableLinkedList data){
    SortableLinkedList positive = new SortableLinkedList();
    SortableLinkedList negative = new SortableLinkedList();
    for (int i = 0; i < data.size(); i++) {
      if (data.get(i) < 0) {
        negative.add(data.remove(i));
      }
      else{
        positive.add(data.remove(i));
      }
      i--;
    }
    radixSortSimple(positive);
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for (int i = 0; i < 10; i++) {
      buckets[i] = new SortableLinkedList();
    }
    int longest = 0;
    int digit = 0;
    for (int i = 0; i < negative.size(); i++) {
      int num = negative.remove(i);
      //establishes number of times the process will need to happen
      if (length(num) > longest) {
        longest = length(num);
      }
      //puts everything in buckets
      buckets[nth(num,digit)].add(num);
      i--;
    }
    //data = new SortableLinkedList();
    /*for (int i = 0; i < 10; i++) {//remove this later
      System.out.println(buckets[i].toString());//remove this later
    }*///remove this later
    mergeReverse(negative,buckets);
    //System.out.println(data.toString());//remove this later
    buckets = new SortableLinkedList[10];
    for (int i = 0; i < 10; i++) {
      buckets[i] = new SortableLinkedList();
    }
    digit+=1;
    //loop for other than 1st digit
    for (int j = 1; j < longest; j++) {
      for (int i = 0; i < negative.size(); i++) {
        int num = negative.remove(i);
        //puts everything in buckets
        buckets[nth(num,digit)].add(num);
        i--;
      }
      //data = new SortableLinkedList();
      mergeReverse(negative,buckets);
      buckets = new SortableLinkedList[10];
      for (int i = 0; i < 10; i++) {
        buckets[i] = new SortableLinkedList();
      }
      digit+=1;
    }
    data.extend(negative);
    data.extend(positive);
  }

}
