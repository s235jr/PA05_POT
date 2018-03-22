import java.util.Scanner;
// zwróć ostatnią cyfre potegowania a^b
public class Main {
    public static void main(String args[]) {
        int result;
        Scanner scanner = new Scanner(System.in);
        int numberOfcase = Integer.parseInt(scanner.nextLine());
        String[] arrayOfNumbers = new String[numberOfcase];
        for (int i = 0; i < numberOfcase; i++) {
            arrayOfNumbers[i] = scanner.nextLine();
        }
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            result = 1;
            String[] number = arrayOfNumbers[i].split(" ");
            int numberA = Integer.parseInt(number[0]) % 10;
            int numberB = Integer.parseInt(number[1]);
            int rest;
            switch (numberA) {
                case 0:
                    result = 0;
                    break;
                case 1:
                    result = 1;
                    break;
                case 2:
                    rest = numberB % 4;
                    if (rest == 0) {
                        result = 6;
                    } else if (rest == 1) {
                        result = 2;
                    } else if (rest == 2) {
                        result = 4;
                    } else {
                        result = 8;
                    }
                    break;
                case 3:
                    rest = numberB % 4;
                    if (rest == 0) {
                        result = 1;
                    } else if (rest == 1) {
                        result = 3;
                    } else if (rest == 2) {
                        result = 9;
                    } else {
                        result = 7;
                    }
                    break;
                case 4:
                    rest = numberB % 2;
                    if (rest == 0) {
                        result = 6;
                    } else {
                        result = 4;
                    }
                    break;
                case 5:
                    result = 5;
                    break;
                case 6:
                    result = 6;
                    break;
                case 7:
                    rest = numberB % 4;
                    if (rest == 0) {
                        result = 1;
                    } else if (rest == 1) {
                        result = 7;
                    } else if (rest == 2) {
                        result = 9;
                    } else {
                        result = 3;
                    }
                    break;
                case 8:
                    rest = numberB % 4;
                    if (rest == 0) {
                        result = 6;
                    } else if (rest == 1) {
                        result = 8;
                    } else if (rest == 2) {
                        result = 4;
                    } else {
                        result = 2;
                    }
                    break;
                case 9:
                    rest = numberB % 2;
                    if (rest == 0) {
                        result = 1;
                    } else {
                        result = 9;
                    }
                    break;
            }
            System.out.println(result % 10);
        }
    }
}
