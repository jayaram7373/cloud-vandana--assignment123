package example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayShuffler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by commas (e.g., 1,2,3,4):");
        String input = scanner.nextLine();
        scanner.close();
        String[] stringArray = input.split(",");
        int[] array = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }

        shuffleArray(array);
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
    
   
}
