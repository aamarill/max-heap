public class MaxHeapTest {

  public static void main(String[] args) {
    givenMultipleValues_whenAddANewMax_thenHeapHeapifies();
  }

  private static void givenMultipleValues_whenAddANewMax_thenHeapHeapifies(){
    MaxHeap maxHeap = new MaxHeap();
    maxHeap.add(1);
    maxHeap.add(2);
    maxHeap.add(3);
    maxHeap.add(4);
    maxHeap.add(5);

    if (maxHeap.peek() == 5) {
      System.out.println("test passed");
    } else
      System.out.println("test failed");
  }
}
