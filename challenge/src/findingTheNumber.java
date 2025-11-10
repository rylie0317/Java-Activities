import java.util.Scanner;

public class findingTheNumber {
    private double rate;
    private double principalValue;
    private double time;
    private double interest;
    private int choice;

    Scanner input = new Scanner(System.in);
    public findingTheNumber (){}

    void askInfo(){

        System.out.println("[1] Rate(%)");
        System.out.println("[2] Interest");
        System.out.println("[3] Principal Value");
        System.out.println("[4] time");
        System.out.println("Enter what value to find");
        choice = input.nextInt();
        switch (choice){
            case 1:
                findingRate();
            case 2:
                findingInterest();
            case 3:
                findingPrincipalValue();
            case 4:
                findingTime();

        }
    }

    void findingRate(){
        rate = interest / (principalValue * (time/12));
        System.out.println("");

    }
    void findingInterest(){
        interest = principalValue * rate * (time/12);
    }
    void findingPrincipalValue(){
        principalValue = interest / (rate * (time/12));
    }
    void findingTime(){
        time = interest / (principalValue * rate);
    }


}

