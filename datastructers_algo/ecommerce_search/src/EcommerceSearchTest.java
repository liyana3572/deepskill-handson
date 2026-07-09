import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearchTest {
    public static void main(String[] args) {

        // Unsorted array — used for linear search
        Product[] products = {
                new Product(105, "Wireless Mouse", "Electronics"),
                new Product(102, "Bluetooth Speaker", "Electronics"),
                new Product(110, "Yoga Mat", "Fitness"),
                new Product(101, "Running Shoes", "Fitness"),
                new Product(108, "Coffee Maker", "Home")
        };

        // Sorted copy — required for binary search
        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts, Comparator.comparingInt(Product::getProductId));

        int targetId = 108;

        long startLinear = System.nanoTime();
        Product resultLinear = SearchAlgorithms.linearSearch(products, targetId);
        long endLinear = System.nanoTime();

        long startBinary = System.nanoTime();
        Product resultBinary = SearchAlgorithms.binarySearch(sortedProducts, targetId);
        long endBinary = System.nanoTime();

        System.out.println("Linear Search Result: " + resultLinear);
        System.out.println("Linear Search Time: " + (endLinear - startLinear) + " ns");

        System.out.println("Binary Search Result: " + resultBinary);
        System.out.println("Binary Search Time: " + (endBinary - startBinary) + " ns");
    }
}