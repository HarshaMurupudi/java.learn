public class PrimitiveTypes {
    public static void main(String[] args) {

        //whole number
            //default 0
        long maxLong = Long.MAX_VALUE;
        byte maxByte = Byte.MAX_VALUE; //smallest range
        int maxInt =  Integer.MAX_VALUE; //2147483647 //default
        short maxShort = Short.MAX_VALUE;

        //real number
            //default 0.0
        float maxFloat = Float.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;

        //single character
        char character = Character.MAX_VALUE;

        //boolean
            //default false
        boolean bool = Boolean.FALSE;

        System.out.println(maxInt + " "
                + maxByte);

        //suffix
        long myLongValue = 100L;
        long bigLong = 2_145L;
    }
}
