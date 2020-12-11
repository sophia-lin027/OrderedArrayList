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
    x.set(2, null);
    System.out.println(x);
  }
}
