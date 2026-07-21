public class FinancialForecast {

    public static double futureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }

        return futureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.08;
        int years = 5;

        double predictedValue = futureValue(currentValue, growthRate, years);

        System.out.println("Current Value: " + currentValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.printf("Predicted Future Value: %.2f%n", predictedValue);

        System.out.println();
        System.out.println("Analysis");
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(n)");
        System.out.println("Recursion simplifies repeated calculations by breaking the problem into smaller subproblems.");
        System.out.println("The recursive solution can be optimized using memoization or by using an iterative approach to avoid excessive recursive calls.");
    }
}