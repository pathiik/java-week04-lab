import java.util.ArrayList;

public class TimeComplexityArrayList {
        public static void main(String[] args) {
                // Test for different sizes of ArrayLists
                for (int size = 1000; size <= 1000000; size *= 10) {
                        ArrayList<Integer> arrayList = new ArrayList<>();

                        // Fill the ArrayList with integers
                        for (int i = 0; i < size; i++) {
                                arrayList.add(i);
                        }

                        // Read by Index (middle)
                        long startTime = System.nanoTime();
                        int element = arrayList.get(size / 2); // Reading from the middle
                        long endTime = System.nanoTime();
                        System.out.println("Reading by index (" + size + " - middle): "
                                        + (endTime - startTime) + " nanoseconds");

                        // Read by Value (last element)
                        startTime = System.nanoTime();
                        arrayList.contains(size - 1); // Searching for the last element
                        endTime = System.nanoTime();
                        System.out.println("Reading by value (" + size + " - last element): "
                                        + (endTime - startTime) + " nanoseconds");

                        // Insert at Head
                        startTime = System.nanoTime();
                        arrayList.add(0, -1); // Inserting at head
                        endTime = System.nanoTime();
                        System.out.println("Insertion at head (" + size + " - head insertion): "
                                        + (endTime - startTime) + " nanoseconds");

                        // Insert at Middle
                        startTime = System.nanoTime();
                        arrayList.add(size / 2, -1); // Inserting in the middle
                        endTime = System.nanoTime();
                        System.out.println("Insertion in the middle (" + size + " - middle insertion): "
                                        + (endTime - startTime) + " nanoseconds");

                        // Insert at Tail
                        startTime = System.nanoTime();
                        arrayList.add(-1); // Insertion at the tail
                        endTime = System.nanoTime();
                        System.out.println("Insertion at tail (" + size + " - tail insertion): "
                                        + (endTime - startTime) + " nanoseconds");

                        // Delete from Head
                        startTime = System.nanoTime();
                        arrayList.remove(0); // Removing from head
                        endTime = System.nanoTime();
                        System.out.println("Deletion from head (" + size + " - head deletion): "
                                        + (endTime - startTime) + " nanoseconds");

                        // Delete from Middle
                        startTime = System.nanoTime();
                        arrayList.remove(size / 2); // Removing from middle
                        endTime = System.nanoTime();
                        System.out.println("Deletion from middle (" + size + " - middle deletion): "
                                        + (endTime - startTime) + " nanoseconds");

                        // Delete from Tail
                        startTime = System.nanoTime();
                        arrayList.remove(arrayList.size() - 1); // Removing from tail
                        endTime = System.nanoTime();
                        System.out.println("Deletion from tail (" + size + " - tail deletion): "
                                        + (endTime - startTime) + " nanoseconds");
                }
        }
}
