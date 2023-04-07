package homework_week_8;

import java.util.Scanner;

public class Programme_1 {
    public static void readTenNumnersAndSum()

    {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); //storing user input (enter key)
        }
        System.out.println("sum = " + sum);
        //closing the scanner object
        scanner.close();
    }
public static void main(String[] args){
        readTenNumnersAndSum();
}

}
