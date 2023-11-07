import java.util.Arrays;

public class JArrays {
    //Variable Argument
    public static void printText(String... textList) {
        for (String text : textList) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {

        //Declaring
        int[] numbers = {1, 2, 3};
        String[] fruits = {"Apple", "Orange"};

        int[] integerArray = new int[10];
        int[] newIntegerArray = new int[]{1, 2, 3};

        //Multiple types
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newIntegerArray;

        //Utilities
        System.out.println(Arrays.toString(objectArray));
        Arrays.sort(numbers);
        Arrays.fill(numbers, 2);
        Arrays.copyOf(numbers, 5);

        // Search array
        // Binary Search
        String[] sArray = {"Able", "Jane", "Mark"};
        Arrays.sort(sArray);
        // return index of the item if found or -1
        int rArray = Arrays.binarySearch(sArray, "Mark");
        if (rArray >= 0) {
            System.out.println("Found Mark in the list");
        }

        //Equality
        int[] s1 = {1, 2, 3};
        int[] s2 = {1, 2, 3};
        Arrays.equals(s1, s2);

        printText("_".repeat(20));

        //2D Arrays
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        for(var outer: array){
            for(var element: outer){
                System.out.println(element);
            }
        }

        System.out.println(Arrays.deepToString(array));
    }
}
