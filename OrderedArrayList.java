import java.util.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  private int helper(T value){
    int index = 0;
    for(int i = 0; i < this.size(); i ++){
      if(value.compareTo(this.get(i)) < 0){
        index = i;
        return index;
      }
    }
    return this.size();
  }

  public void add(int index, T element) {
    int ind = helper(element);
    super.add(ind, element);
  }

  public boolean add(T element) {
    int ind = helper(element);
    super.add(ind,element);
    return true;
  }

  public T set(int index, T element) {
    int ind = helper(element);
    T temp = this.get(index);
    if (ind == 0){
      super.add(element);
    }
    else{
      super.add(ind,element);
    }
    this.remove(index);
    return temp;
  }

  public OrderedArrayList() {
    super();
  }
}
