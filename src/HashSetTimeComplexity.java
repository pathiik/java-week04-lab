import java.util.HashSet;

public class HashSetTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of HashSets
        for (int size = 1000; size <= 1000000; size *= 10) {
            HashSet<Integer> hashSet = new HashSet<>();

            // Fill the HashSet with integers
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }

            // Read by value (last element)
            long startTime = System.nanoTime();
            hashSet.contains(size - 1); // Searching for the last element
            long endTime = System.nanoTime();
            System.out.println("Reading by value (" + size + " - last element): "
                    + (endTime - startTime) + " nanoseconds");
        }
    }
}
