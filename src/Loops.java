public class Loops {
    public static void main(String[] args){

        int sum = 0;
        int count = 0;
        //Basic Loop
        for(int i =1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                sum += i;
                count++;
                if (count == 5) break;
            }
        }

        int[] rows = {2, 3, 4};
        //Enhanced
        for(int row : rows) {
            System.out.println(row);
        }

        System.out.println(sum);
    }
}
