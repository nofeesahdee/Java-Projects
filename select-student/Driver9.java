import java.util.Scanner;

public class Driver9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberStudent = scan.nextInt();

        String[] student = new String[numberStudent];
        int[] age = new int[numberStudent];

        Scanner scanAge = new Scanner(System.in);
        Scanner scanName = new Scanner(System.in);

        for (int i = 0; i < numberStudent; i++) {
            System.out.println("Enter name:");
            student[i] = scanName.nextLine();
            System.out.println("Enter age:");
            age[i] = scanAge.nextInt();
        }
        for (int i = 0; i < numberStudent; i++) {
            if (age[i] >= 15) {
                System.out.println(student[i] + " cannot recieve vaccine.");
                System.out.println("The student is now " + age[i]);
            }
        }
        scan.close();
        scanAge.close();
        scanName.close();
    }
}
