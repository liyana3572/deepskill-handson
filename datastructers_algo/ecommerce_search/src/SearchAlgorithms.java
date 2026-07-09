public class SearchAlgorithms {

    // Linear Search — O(n) worst case, works on unsorted array
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }
        return null; // not found
    }

    // Binary Search — O(log n) worst case, REQUIRES array sorted by productId
    public static Product binarySearch(Product[] sortedProducts, int targetId) {
        int low = 0;
        int high = sortedProducts.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // avoids overflow vs (low+high)/2
            int midId = sortedProducts[mid].getProductId();

            if (midId == targetId) {
                return sortedProducts[mid];
            } else if (midId < targetId) {
                low = mid + 1;   // search right half
            } else {
                high = mid - 1;  // search left half
            }
        }
        return null; // not found
    }
}