import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("How much can you spend");
        Scanner scan = new Scanner(System.in);
        double total = scan.nextDouble();
        int sum = 0;
        int i = 0;
        ArrayList<Double> proportion = new ArrayList<Double>();
        System.out.println("Enter your proportion of various expenses");
        System.out.println("The system stops if cummulative expense exceed 100%");

        do {
            System.out.println("Your proportion of expense" + (i + 1) + ":");
            double value = scan.nextDouble();
            proportion.add(value);
            sum += proportion.get(i);
        } while (sum <= 100);
        scan.close();
        if (sum > 100) {
            double cummulative = 0.0;
            for (int j = 0; j < proportion.size() - 1; j++) {
                cummulative += proportion.get(j);
            }
            proportion.set(proportion.size() - 1, 100.0 - cummulative);
        }
        for(double value : proportion){
            double expense = value * total / 100.0;
            System.out.println("Your " + value + " % equals $" + expense);
        }
    }
}

