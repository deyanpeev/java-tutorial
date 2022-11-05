import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[] array = generateArray(10);
//        int[] array2 = array;
//
//        System.out.println(array);
//        System.out.println(array2);
//
//        array2[0] = 10;
//
//        printArray(array);
//        System.out.println();
//        printArray(array2);

        int[] array = new int[]{0, 1, 1, 2, 0, 0, 510, 12, 5};

        System.out.println(sumArray(array));
//        Arrays.sort(array);
//        printArray(array);
//        int index = Arrays.binarySearch(array, 400); //always call sort before binarySearch
//        System.out.println(index);
    }

    public static int sumArray(int[] array) {
//        int sum = 0;
//        for (int element : array) {
//            sum += element;
//        }

//        return sum;
        return Arrays.stream(array).sum();
    }

    public static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    public static void printArray(int[] array) {
//        for (int element : array) {
//            System.out.print(element + " "); //array[i]
//        }

//        for(int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

        System.out.println(Arrays.toString(array));
    }
}