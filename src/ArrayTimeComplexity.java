public class ArrayTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // 1. Read by index (middle)
            long startTime = System.nanoTime();
            int element = array[size / 2]; // Reading from the middle
            long endTime = System.nanoTime();
            System.out.println("Reading by index (" + size + " - middle): " + (endTime - startTime)
                    + " nanoseconds");

            // 2. Read by value (last element)
            startTime = System.nanoTime();
            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (array[i] == size - 1) {
                    found = true;
                    break;
                }
            }
            endTime = System.nanoTime();
            System.out.println("Reading by value (" + size + " - last element): " + (endTime - startTime)
                    + " nanoseconds");
        }
    }
}
