import java.util.ArrayList;

public class Tester {
  public static void main (String[] args) {
    ArrayList<String> x = new NoNullArrayList<String>();
    x.add("hello");
    x.add("hi");
    x.add("heya");
    //x.add(2, null);
    System.out.println(x);
    //x.add(null);
    System.out.println(x);
    x.set(1, "why");
    //x.set(2, null);
    System.out.println(x);

    ArrayList<Integer> y = new OrderedArrayList<Integer>();
    y.add(4);
    y.add(-5);
    y.add(3);
    y.add(2);
    System.out.println(y);
    y.add(1, -4);
    //y.set(3, 100);
    System.out.println(y);

    ArrayList<String> z = new OrderedArrayList<String>();
    z.add("a");
    z.add("b");
    z.add("c");
    System.out.println(z);
    z.add(1, "d");
    System.out.println(z);
    z.set(2, "z");
    System.out.println(z);
  }
}
