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

  SortableLinkedList og = new SortableLinkedList();
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
  System.out.println(og.toString());

}

}
