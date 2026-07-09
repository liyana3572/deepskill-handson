public class FinancialForecaster {


    public static double futureValueRecursive(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return futureValueRecursive(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static double futureValueMemoized(double presentValue, double growthRate, int years, double[] memo) {
        if (years == 0) {
            return presentValue;
        }
        if (memo[years] != 0) {
            return memo[years];
        }
        double result = futureValueMemoized(presentValue, growthRate, years - 1, memo) * (1 + growthRate);
        memo[years] = result;
        return result;
    }
}