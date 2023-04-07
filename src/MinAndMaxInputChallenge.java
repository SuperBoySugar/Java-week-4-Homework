import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void findMinAndMaxNumbers() {
        //sccanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        //while loop
        while (true) {
            int number = scanner.nextInt();
            if (first) {
                first = false;
                min = number;
                max = number;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min + " , Max = " + max);
        scanner.close();

    }

    public static void main(String[] args) {
        findMinAndMaxNumbers();
    }
}
