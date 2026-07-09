# Exercise 2: E-commerce Platform Search Function

## Asymptotic Notation

Big O notation describes how an algorithm's running time grows as the input
size (n) increases. It measures rate of growth rather than exact speed,
which makes it possible to compare algorithms independently of hardware.
Big O refers to the worst case of execution. 

**Best, average, and worst case for search:**
- **Best case** — the target is found on the very first check.
  Linear search: O(1). Binary search: O(1) (target is the middle element).
- **Average case** — Linear search checks about half the list: O(n).
  Binary search halves the search space each step: O(log n).
- **Worst case** — the target is missing or at the end of the search path.
  Linear search: O(n). Binary search: O(log n).

## Implementation

- `Product.java` — model with `productId`, `productName`, `category`.
- `SearchAlgorithms.java` — `linearSearch()` (works on any array) and
  `binarySearch()` (requires the array sorted by `productId`).
- `EcommerceSearchTest.java` — runs both searches and times them.

## Analysis

| | Linear Search | Binary Search |
|---|---|---|
| Best case | O(1) | O(1) |
| Average case | O(n) | O(log n) |
| Worst case | O(n) | O(log n) |
| Requires sorted data | No | Yes |

Binary search scales far better for large product catalogs — for a
million products, linear search may check all million entries in the
worst case, while binary search checks around 20. The tradeoff is that
binary search needs the data sorted by the search key, so inserts/updates
carry an extra cost. In production, this is typically handled by database
indexes (B-trees), which behave like a self-maintaining binary search —
making this a realistic simplification of how real e-commerce search works.