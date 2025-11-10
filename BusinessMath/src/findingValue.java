import java.util.Scanner;

class Display {
    private double rate;
    private double principalValue;
    private double time;
    private double interest;

    Scanner input = new Scanner(System.in);
    public Display(){}

    void askInfo() {

        System.out.println("[1] Rate(%)");
        System.out.println("[2] Interest");
        System.out.println("[3] Principal Value");
        System.out.println("[4] time");
        System.out.println("Enter what value to find:");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                findingRate();
                break;
            case 2:
                findingInterest();
                break;
            case 3:
                findingPrincipalValue();
                break;
            case 4:
                findingTime();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    void findingRate(){
        System.out.print("Enter the interest:");
        interest = input.nextDouble();
        System.out.print("Enter the principal value ");
        principalValue = input.nextDouble();
        System.out.print("Enter the time:");
        time = input.nextDouble();

        rate = interest / (principalValue * (time/12));
        System.out.printf("The rate is %.2f", rate);
    }
    void findingInterest(){
        System.out.print("Enter the rate:");
        rate = input.nextDouble();
        System.out.print("Enter the principal value ");
        principalValue = input.nextDouble();
        System.out.print("Enter the time:");
        time = input.nextDouble();


        interest = principalValue * rate * (time/12);
        System.out.printf("The interest is %.2f", interest);
    }
    void findingPrincipalValue(){
        System.out.print("Enter the rate:");
        rate = input.nextDouble();
        System.out.print("Enter the interest:");
        interest = input.nextDouble();
        System.out.print("Enter the time:");
        time = input.nextDouble();

        principalValue = interest / (rate * (time/12));
        System.out.printf("The Principal Value is %.2f", principalValue);
    }
    void findingTime(){

        System.out.print("Enter the rate:");
        rate = input.nextDouble();
        System.out.print("Enter the interest:");
        interest = input.nextDouble();
        System.out.print("Enter the principal value ");
        principalValue = input.nextDouble();


        time = (interest / (principalValue * rate)) * 12;
        System.out.printf("The time is %.2f months", time);
    }

    public static void main(String[] args) {
        Display display = new Display();
        display.askInfo();
    }

}


