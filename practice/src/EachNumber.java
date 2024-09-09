import java.util.Scanner;

public class EachNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int i = scanner.nextInt();
        while (i > 0) {
            int n=i % 10;
            System.out.println(n);
            i=i/10;
        }
//        System.out.println(i%10);
//        System.out.println(i/10);
    }
}
