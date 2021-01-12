public class RadixTester{

  public static void main(String[]args){
    System.out.println(Radix.nth(273,0));
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
    System.out.println(og.toString());
  }

}
