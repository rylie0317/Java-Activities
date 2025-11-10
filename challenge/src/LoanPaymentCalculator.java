import java.util.Scanner;

class LoanCalculator{
    private double loanAmount;
    private double annualInterestRate;
    private int loanTermYears;
    private double monthlyPayment;
    private double totalPayment;
    private double totalInterest;

    Scanner s = new Scanner(System.in);
    public LoanCalculator(){

    }

    public void askInfo(){
        System.out.println("Enter loan amount:");
        loanAmount = s.nextDouble();
        System.out.println("Enter annual interest rate");
        annualInterestRate = s.nextDouble();
        System.out.println("Enter loan term (years):");
        loanTermYears = s.nextInt();
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanTermYears() {
        return loanTermYears;
    }

    public void setLoanTermYears(int loanTermYears) {
            this.loanTermYears = loanTermYears;

    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    public void computePayment() {
        // it is to equalize the portion of annual interest rate to monthly
        double monthlyRate = (annualInterestRate / 100) / 12;
        int totalMonths = loanTermYears * 12;

        monthlyPayment = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, totalMonths)
                / (Math.pow(1 + monthlyRate, totalMonths) - 1));
        totalPayment = monthlyPayment * totalMonths;
        totalInterest = totalPayment - loanAmount;
    }
    public void display(){

        System.out.println("\n--- Loan Summary ---");
        System.out.printf("Loan Amount: ₱%.2f%n", loanAmount);
        System.out.printf("Annual Interest Rate: %.2f%n", annualInterestRate);
        System.out.printf("Loan Term: %d years%n", loanTermYears);
        System.out.printf("Monthly Payment: ₱%.2f%n", monthlyPayment);
        System.out.printf("Total Payment: ₱%.2f%n", totalPayment);
        System.out.printf("Total Interest: ₱%.2f%n", totalInterest);

    }
}

public class LoanPaymentCalculator {
    public static void main(String[] args) {

        LoanCalculator loanCalculator = new LoanCalculator();
        loanCalculator.askInfo();
        loanCalculator.computePayment();
        loanCalculator.display();
    }
}


