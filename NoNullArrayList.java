import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  private T value;

  public void add(int index, T element) {
    value = element;
    if (value == null) {
      throw new IllegalArgumentException("Your element is null");
    }
    super.add(index, value);
  }
}

  // public boolean add(T t) {
  //
  // }
  //
  // public T set (int index, T element) {
  //
  // }
