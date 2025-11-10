import java.util.Scanner;

public class MonthlySavingsGoalTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double monthlyIncome;
        double monthlyExpenses;
        double savingGoalAmount;
        double totalSavings = 0;

        System.out.println("Enter the amount of your goal savings:");
        savingGoalAmount = scanner.nextDouble();

    while (totalSavings < savingGoalAmount) {
        System.out.println("m");
        System.out.print("Enter the amount of your monthly income:");
        monthlyIncome = scanner.nextDouble();
        System.out.println("Enter the amount of your monthly expenses:");
        monthlyExpenses = scanner.nextDouble();


        totalSavings = monthlyIncome - monthlyExpenses;
        System.out.println("October,2025");
        }

    }
}
