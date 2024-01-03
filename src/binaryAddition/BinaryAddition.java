package binaryAddition;

import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("This program adds 2 binary values");
        System.out.println("Enter the longer binary number");
        String firstNum = user.nextLine();
        System.out.println("Enter the second binary number");
        String secondNum = user.nextLine();
        int firstLength = firstNum.length();
        int secondLength = secondNum.length();
        int difference = Math.abs(firstLength - secondLength);

        int j = 1;
        while (j <= difference) {
            if (firstLength < secondLength) {
                firstNum = "0" + firstNum;
            } else {
                secondNum = "0" + secondNum;
                j = j + 1;
            }
        }

        int i = firstNum.length() - 1;
        String result = "";
        int carry = 0;
        while (i >= 0) {
            int bit1 = firstNum.charAt(i) - '0';
            int bit2 = secondNum.charAt(i) - '0';
            int sum = bit1 + bit2 + carry;
            carry = sum / 2;
            int remainder = sum % 2;
            result = remainder + result;
            i = i - 1;
        }

        if (carry == 1) {
            result = carry + result;
        }

        user.close();
        System.out.println("The result is: " + result);
        System.out.println("The entered numbers are: " + firstNum + "   " + secondNum);
    }
}
