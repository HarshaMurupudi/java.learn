import java.util.Arrays;

public class JArrays {
    public static void main(String[] args){

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

        //Search array
    }

}
