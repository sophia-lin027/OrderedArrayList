import java.util.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  private int helper(T value){
    int index = 0;
    for(int i = 0; i < super.size(); i++){
      if(value.compareTo(super.get(i)) < 0){
        index = i;
        return index;
      }
    }
    return super.size();
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Your element is null :(");
    }
    int ind = helper(element);
    super.add(ind, element);
  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException("Your element is null :(");
    }
    int ind = helper(element);
    super.add(ind, element);
    return true;
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Your element is null :(");
    }
    int ind = helper(element);
    T temp = super.get(index);
    super.add(ind, element);
    super.remove(temp);
    return temp;
  }

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(T startingCapacity) {
    super(startingCapacity);
    if (startingCapacity == null) {
      throw new IllegalArgumentException("The initial capacity cannot be null");
    }
  }
}
