public class ForecastTest {
    public static void main(String[] args) {
        double presentValue = 10000; // starting investment/revenue
        double growthRate = 0.07;    // 7% annual growth
        int years = 10;

        // Naive recursive
        double resultNaive = FinancialForecaster.futureValueRecursive(presentValue, growthRate, years);
        System.out.println("Future value (naive recursion), " + years + " years: " + resultNaive);

        // Memoized recursive — print forecast for every year up to 10
        double[] memo = new double[years + 1];
        System.out.println("\nYear-by-year forecast (memoized):");
        for (int y = 0; y <= years; y++) {
            double value = FinancialForecaster.futureValueMemoized(presentValue, growthRate, y, memo);
            System.out.printf("Year %d: %.2f%n", y, value);
        }
    }
}