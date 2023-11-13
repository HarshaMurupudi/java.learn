public class Loops {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        //Basic For Loop
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                count++;
                if (count == 5) break;
            }
        }

        int[] rows = {2, 3, 4};
        //Enhanced For Loop
        for (int row : rows) {
            System.out.println(row);
        }

        System.out.println(sum);

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        while (true) {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        }

        //do while will excecutes atleast once
        //ask users name or password
        boolean isReady = false;
        do {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        } while (isReady);

        //continue
            //stop current interation of block and start new iteration
            // avoid if else
        int number = 0;
        while (number < 50){
            number += 5;
            if(number % 25 == 0){
                continue;
            }
            System.out.println(number + "_");
        }
    }
}
