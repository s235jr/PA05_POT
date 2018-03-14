import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int result;
        Scanner scannerInt = new Scanner(System.in);
        int numberOfcase = scannerInt.nextInt();
        String[] arrayOfNumbers = new String[numberOfcase];
        for (int i = 0; i < numberOfcase; i++) {
            Scanner scannerString = new Scanner(System.in);
            arrayOfNumbers[i] = scannerString.nextLine();
        }
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            result = 1;
            String[] number = arrayOfNumbers[i].split(" ");
            for (int k = 0; k < Integer.parseInt(number[1]); k++) {
                result = (result % 10) * Integer.parseInt(number[0]);
            }
            System.out.println(Math.round(result % 10));
        }
    }
}