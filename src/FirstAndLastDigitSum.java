import java.util.Scanner;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0) {
            return -1;
        }
        int r, rev = 0, fd, id, s;
        id = number % 10;
        while (number > 0) {
            r = number % 10;
            rev = rev * 10 + r;
            number = number / 10;
        }
        fd = rev % 10;
        s = fd + id;
        return  s;
    }

    public static void main(String[] args) {
        //scanner delcaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a = scanner.nextInt();
        System.out.println("The sum of first & last digit is: " + sumFirstAndLastDigit(a));
        scanner.close();
    }
}
