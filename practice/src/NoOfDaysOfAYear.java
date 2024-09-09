import java.util.Scanner;

public class NoOfDaysOfAYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the year");
        int year = scanner.nextInt();
        System.out.println("enter the month");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                case 3:
                    case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+": is 31 days");
                break;
            case 4:
                case 6:
            case 9:
                case 11:
                    System.out.println(month+": is 30 days");
                        break;
                        case 2:
                            if (year%400==0 || (year%4==0&& year%100!=0)){
                                System.out.println(month+": is 28 days");
                            }else System.out.println(month+": is 30 days");
        }
    }
}
