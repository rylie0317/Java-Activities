import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AverageGrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int averageGrade = 0;
        int sumGrade = 0;
        int subject;
        String[] typeSubject = new String[10];

        System.out.println("how many subjects do you have?");
        subject = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < subject; i++){
            System.out.println("Enter the name of the subject "+ (i + 1) );
            typeSubject[i]= scanner.nextLine();
        }

        int[] grade = new int[subject];
        for (int x = 0; x < subject; x++) {
            System.out.println("Enter your grade in " + typeSubject[x]);
            grade[x] = scanner.nextInt();
            sumGrade += grade[x];
            averageGrade = sumGrade / subject;
        }

        System.out.println("General Average: " + averageGrade);

        if (averageGrade >= 98) {
            System.out.println("With Highest Honor");
        } else if (averageGrade >= 95) {
            System.out.println("With High Honor");
        } else if (averageGrade >= 90) {
            System.out.println("With Honor");
        } else if (averageGrade >= 75) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

    }
}