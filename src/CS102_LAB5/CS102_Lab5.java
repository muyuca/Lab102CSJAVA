package CS102_LAB5;

import java.io.*;
import java.util.*;

public class CS102_Lab5 {
    public static Scanner kb = new Scanner(System.in);

    public static boolean isPalindrome(String str){
        String newPalindrome= "",tersPalindrom="";
        for(int i=0; i<str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                newPalindrome += str.charAt(i);

            }
        }
        for(int j = (str.length() - 1) ;j >=0;j--){
            if (Character.isLetterOrDigit(str.charAt(j))){
                tersPalindrom += str.charAt(j);

            }
        }
        String upperNewPalindrome=newPalindrome.toUpperCase();
        String upperTersPalindrome=tersPalindrom.toUpperCase();
        if(upperNewPalindrome.equals(upperTersPalindrome)){
            return true;
        }
        return false;
    }
    public static void readints(String fileName) throws FileNotFoundException {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            int cnt = 0;
            int sum = 0;
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.print(num + " ");
                cnt++;
                sum += num;
            }
            System.out.printf("\nCount of numbers: %.2f\n" , cnt);
            System.out.printf("Sum of numbers: %.2f\n" , sum);
            System.out.printf("Average: %.2f\n", (double) sum / cnt);
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found (" + fileName+")");
        }
    }
    public static double randomDoubles(int cnt, double lowerLimit, double upperLimit) {
        double sum = 0.0;
        for (int i = 1; i <= cnt; i++) {
            double randomNumber = Math.random() * (upperLimit - lowerLimit) + lowerLimit;
            System.out.printf("%.3f ", randomNumber);
            sum += randomNumber;
        }
        System.out.println();
        return sum;
    }
    public static void main(String[] arg) throws IOException {
        System.out.println("PART 1:");
        System.out.print("Enter a string :");
        String str  = kb.nextLine();
        if (isPalindrome(str)){
            System.out.println("This string is a palindrome.");
        }
        else{
            System.out.println("This string is not a palindrome.");
        }

        System.out.println("\nPART 2:");
        System.out.print("Enter file name: ");
        String fileName = kb.next();
        readints("ints.txt");

        System.out.println("\nPART 3:");
        System.out.print("Enter count of numbers: ");
        int count = kb.nextInt();

        System.out.print("Enter lower limit: ");
        double lowerLimit = kb.nextDouble();

        System.out.print("Enter upper limit: ");
        double upperLimit = kb.nextDouble();

        double sum = randomDoubles(count, lowerLimit, upperLimit);

        double average = sum / count;

        System.out.printf("Sum = %.3f \n",sum);
        System.out.printf("Average = %.3f \n",average);
        


    }
}
