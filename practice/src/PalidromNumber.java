import java.util.Scanner;

public class PalidromNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int i = scanner.nextInt();
        int number=i;
        int rev=0;
        while (i>0) {
            rev=rev*10+i%10;
            i=i/10;
        }
        if (number==rev) System.out.println(number+" : is a palidrom number");
        else System.out.println(number+" : is a not palidrom number");

    }
}
