import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Your element is null :(");
    }
    super.add(index, element);
  }

  public boolean add(T t) {
    if (t == null) {
      throw new IllegalArgumentException("Your element is null :(");
    }
    super.add(t);
    return true;
  }

  public T set (int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Your element is null :(");
    }
    super.set(index, element);
    return element;
  }

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(T startingCapacity) {
    super();
    if (startingCapacity == null) {
      throw new IllegalArgumentException("The initial capacity cannot be null");
    }
  }
}
