# Exercise 7: Financial Forecasting

## Recursive Algorithms

Recursion is when a function calls itself to solve a smaller version of
the same problem, until it reaches a base case that stops the recursion.
Compound growth is naturally recursive: this year's value depends on
last year's value, which depends on the year before. 

## Implementation

- `FinancialForecaster.futureValueRecursive()` — naive recursive approach,
  recalculates from scratch on each call.
- `FinancialForecaster.futureValueMemoized()` — optimized version that
  caches each year's result in a `memo` array to avoid recomputation.
- `ForecastTest.java` — prints a year-by-year forecast table.

## Analysis

**Time complexity (naive recursion):** O(n), where n = number of years.
Each call does one multiplication and makes exactly one recursive call —
linear, not exponential, since there's no branching.

**Where it gets expensive:** repeated calls for overlapping year ranges
(e.g., year 5, then 8, then 10) redo the same calculations each time.

**Optimization:** memoization caches each computed year, turning repeated
year-by-year forecasting from O(n²) total work into O(n) total work.
For very large year counts, an iterative loop would also be safer than
recursion, since Java doesn't optimize tail calls and deep recursion
risks a `StackOverflowError`.