public class Program_13_SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >=10 && secondNumber <= 99)){
            int firstNumberLastDigit = firstNumber;
            int secondNumberLastDigit = secondNumber;
            firstNumber /= 10;
            secondNumber /= 10;
            int firstNumberFirstDigit = firstNumber;
            int secondNumberFirstDigit = secondNumber;
            return ((firstNumberFirstDigit == secondNumberFirstDigit) ||
                    (firstNumberFirstDigit == secondNumberFirstDigit) ||
                    (firstNumberLastDigit == secondNumberFirstDigit) ||
                    (firstNumberLastDigit == secondNumberLastDigit));

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}
