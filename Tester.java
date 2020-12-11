import java.util.ArrayList;

public class Tester {
  public static void main (String[] args) {
    ArrayList<String> x = new NoNullArrayList<String>();
    x.add("hello");
    x.add("hi");
    x.add("heya");
    //x.add(2, null);
    x.add(null);
    System.out.println(x);
    System.out.println(x);
  }
}
