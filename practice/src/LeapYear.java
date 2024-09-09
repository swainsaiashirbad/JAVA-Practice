import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i%4==0 && i%100!=0){
            System.out.println(i+": is a leap year");
        } else if (i%400==0) {
            System.out.println(i+": is a leap year");
        }
        else
            System.out.println(i+": is not a leap year");
    }
}
