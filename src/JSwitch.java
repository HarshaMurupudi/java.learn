public class JSwitch {

    public String returnStr() {
        int switchValue = 3;
        // switch with return
        switch (switchValue) {
            case 1:
            case 2:
            case 3:
                return "1, 2, 3";
            case 4:
                return "4";
        }

        return "any";
    }

    public static void main(String... args) {

        //Traditional
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a, a 4 or a 5");
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }

        //Enhanced
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("was a 3, a 4, or a 5");
            }
            default -> System.out.println("was not 1, 2, 3, 4, or 5");
        }
    }
}
