package CS102_LAB6;
import java.util.*;

public class CS102_Lab6 {
    public static Scanner kb = new Scanner(System.in);
    public static int inputints(int[] array) {
        int count = 0;

        while (true) {
            System.out.print("Enter a number : ");
            int num = kb.nextInt();
            if (num == 0) {
                break;
            }
            array[count++] = num;
        }
        return count;
    }

    public static void printArray(int[] array, int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    public static int[] array2AL(int[] array, int size) {
        int[] reversedArray = new int[size];
        int index = 0;
        for (int i = size - 1; i >= 0; i--) {
            reversedArray[index++] = array[i];
        }
        return reversedArray;
    }

    public static void printAL(int[] array) {
        System.out.println("ArrayList:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
    public static int maxAL(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< array.length;i++){
            if (array[i]>max) {
                max=array[i];
            }
        }
        return max;
    }
    public static int sumAL(int[] array){
        int sum = 0;
        for(int i=0;i< array.length;i++){
            sum +=array[i];
        }
        return sum;
    }
    public static void main(String[] arg) {
        int[] array = new int[100];
        int count = inputints(array);
        System.out.println("There are " + count+ " numbers: ");
        printArray(array, count);


        int[] reversedArray = array2AL(array, count);
        printAL(reversedArray);

        System.out.println("Maximum = "+maxAL(reversedArray));
        System.out.println("Sum = "+sumAL(reversedArray));
        double sum = sumAL(reversedArray);
        double avarage= sum/count;
        System.out.println("Avarage = "+ avarage);

    }
}
