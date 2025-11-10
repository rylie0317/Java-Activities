import java.util.Scanner;

public class investmentGrowthTracker {
    private double initialAmount;
    private double annualInterestRate;
    private int year;
    private double finalAmount;
    private double totalProfit;

    Scanner scanner = new Scanner(System.in);
    public investmentGrowthTracker() {
    }


    void askInfo(){
        System.out.print("Enter the amount you invested:");
        initialAmount = scanner.nextDouble();
        System.out.println("Enter annual interest rate");
        annualInterestRate = scanner.nextDouble();
        System.out.println("Enter ");
    }

}