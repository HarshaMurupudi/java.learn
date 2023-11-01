package challenge.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        System.out.println(Arrays.toString(sortIntegers(unsortedArray)));
        System.out.println(Arrays.toString(sortIntegers(new int[]{45, 23, 71})));
    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] randomArray = new int[len];

        for(int i=0; i < len; i++){
            randomArray[i] = random.nextInt(1000);
        }

        return randomArray;
    }

    private static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;

        boolean flag =true;
        while(flag){
            flag = false;
            for(int i = 0; i < array.length -1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
