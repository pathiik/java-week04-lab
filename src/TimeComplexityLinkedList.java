import java.util.LinkedList;

public class TimeComplexityLinkedList {
    public static void main(String[] args) {
        // Test for different sizes of LinkedLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Fill the LinkedList with integers
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            // Read by Index (middle)
            long startTime = System.nanoTime();
            int element = linkedList.get(size / 2); // Reading from the middle
            long endTime = System.nanoTime();
            System.out.println("Reading by index (" + size + " - middle): "
                    + (endTime - startTime) + " nanoseconds");

            // Read by Value (last element)
            startTime = System.nanoTime();
            linkedList.contains(size - 1); // Searching for the last element
            endTime = System.nanoTime();
            System.out.println("Reading by value (" + size + " - last element): "
                    + (endTime - startTime) + " nanoseconds");

            // Insert at Head
            startTime = System.nanoTime();
            linkedList.addFirst(-1); // Inserting at head
            endTime = System.nanoTime();
            System.out.println("Insertion at head (" + size + " - head insertion): "
                    + (endTime - startTime) + " nanoseconds");

            // Insert at Middle
            startTime = System.nanoTime();
            linkedList.add(size / 2, -1); // Inserting in the middle
            endTime = System.nanoTime();
            System.out.println("Insertion in the middle (" + size + " - middle insertion): "
                    + (endTime - startTime) + " nanoseconds");

            // Insert at Tail
            startTime = System.nanoTime();
            linkedList.addLast(-1); // Inserting at the tail
            endTime = System.nanoTime();
            System.out.println("Insertion at tail (" + size + " - tail insertion): "
                    + (endTime - startTime) + " nanoseconds");

            // Delete from Head
            startTime = System.nanoTime();
            linkedList.removeFirst(); // Removing from head
            endTime = System.nanoTime();
            System.out.println("Deletion from head (" + size + " - head deletion): "
                    + (endTime - startTime) + " nanoseconds");

            // Delete from Middle
            startTime = System.nanoTime();
            linkedList.remove(size / 2); // Removing from middle
            endTime = System.nanoTime();
            System.out.println("Deletion from middle (" + size + " - middle deletion): "
                    + (endTime - startTime) + " nanoseconds");

            // Delete from Tail
            startTime = System.nanoTime();
            linkedList.removeLast(); // Removing from tail
            endTime = System.nanoTime();
            System.out.println("Deletion from tail (" + size + " - tail deletion): "
                    + (endTime - startTime) + " nanoseconds");
        }
    }
}
