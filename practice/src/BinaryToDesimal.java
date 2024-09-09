import java.util.Scanner;

public class BinaryToDesimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a binary number");
        int b= scanner.nextInt();
        int decimal=0;
        int iterations=1;
        while (b>0) {
            decimal=decimal+(b%10)*iterations;
            b/=10;
            iterations*=2;

        }
        System.out.println(decimal);
    }
}
