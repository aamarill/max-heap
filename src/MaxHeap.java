import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

  private List<Integer> items = new ArrayList<>();

  public void print(){
    System.out.println(items);
  }

  public Integer peek() {
    return items.get(0);
  }

  public void add(Integer item) {
    items.add(item);
    heapify(items);
  }

  public Integer removeMax() {
    Integer max = items.get(0);
    moveLastToTop();
    reverseHeapify();
    return max;
  }

  private void moveLastToTop() {
    items.set(0, items.get(lastIndex()));
    items.remove(lastIndex());
  }

  private void reverseHeapify() {
    // implement
  }

  private void heapify(List<Integer> items) {
    int childIndex = items.size() - 1;
    int parentIndex = getParentIndex(childIndex);
    Integer child = items.get(childIndex);
    Integer parent = items.get(parentIndex);

    while (childIndex > 0 && child > parent) {
      swap(parentIndex, childIndex);
      childIndex = parentIndex;
      parentIndex = getParentIndex(childIndex);
    }
  }

  private void swap(int parentIndex, int childIndex) {
    Integer parent = items.get(parentIndex);
    Integer child = items.get(childIndex);
    items.set(parentIndex, child);
    items.set(childIndex, parent);
  }

  private int getParentIndex(int i) {
    return (i - 1) / 2;
  }

  private int lastIndex() {
    return items.size() - 1;
  }

}
