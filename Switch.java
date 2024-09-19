public class Switch {
    public static void main(String[] args) {
        int day = 4;
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;

                // there can be multiple cases for a single statement
            case 4: case 10:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            // Default case is optional
            default:
                System.out.println("Invalid day");
        }
    }
}
