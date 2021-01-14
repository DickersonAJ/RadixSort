public class RadixTester{

  public static void main(String[]args){
    /*System.out.println(Radix.nth(273,0));
    System.out.println(Radix.nth(273,1));
    System.out.println(Radix.nth(273,2));
    System.out.println(Radix.length(123456789));
    System.out.println(Radix.nth(-273,2));
    System.out.println(Radix.length(-123456789));

    MyLinkedList og = new MyLinkedList();
    og.add("hello");
    MyLinkedList chain = new MyLinkedList();
    chain.add("one");
    chain.add("two");
    chain.add("three");
    MyLinkedList[] chains = new MyLinkedList[10];
    for (int i = 0; i < 10; i++){
      chains[i] = new MyLinkedList();
      chains[i].add(i+"");
      chains[i].add("beep");
      chains[i].add("bop");
    }
    Radix.merge(og, chains);
    System.out.println(og.toString());*/

  /*SortableLinkedList og = new SortableLinkedList();
  og.add(100);
  SortableLinkedList chain = new SortableLinkedList();
  chain.add(1);
  chain.add(2);
  chain.add(3);
  SortableLinkedList[] chains = new SortableLinkedList[10];
  for (int i = 0; i < 10; i++){
    chains[i] = new SortableLinkedList();
    chains[i].add(i);
    chains[i].add(3);
    chains[i].add(0);
  }
  Radix.merge(og, chains);
  System.out.println(og.toString());*/

  SortableLinkedList unsorted = new SortableLinkedList();
  unsorted.add(8);
  unsorted.add(9);
  unsorted.add(1);
  unsorted.add(7);
  unsorted.add(6);
  unsorted.add(3);
  unsorted.add(0);
  unsorted.add(5);
  unsorted.add(2);
  unsorted.add(4);
  System.out.println(unsorted.toString());
  Radix.radixSortSimple(unsorted);
  System.out.println(unsorted.toString());
  SortableLinkedList sorted = new SortableLinkedList();
  sorted.add(38);
  sorted.add(96);
  sorted.add(100);
  sorted.add(7);
  sorted.add(56);
  sorted.add(367);
  sorted.add(03);
  sorted.add(58);
  sorted.add(2);
  sorted.add(4);
  System.out.println(sorted.toString());
  Radix.radixSortSimple(sorted);
  System.out.println(sorted.toString());
  SortableLinkedList xsorted = new SortableLinkedList();
  xsorted.add(38);
  xsorted.add(96);
  xsorted.add(-100);
  xsorted.add(7);
  xsorted.add(56);
  xsorted.add(367);
  xsorted.add(03);
  xsorted.add(-58);
  xsorted.add(2);
  xsorted.add(-4);
  System.out.println(xsorted.toString());
  Radix.radixSort(xsorted);
  System.out.println(xsorted.toString());

  }

}
