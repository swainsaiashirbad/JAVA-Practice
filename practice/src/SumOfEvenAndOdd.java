import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int n = scanner.nextInt();
        int evenSum =0,oddSum =0;
        while (n>0) {
            if ((n%10)%2==0) evenSum+=n%10;
            else oddSum+=n%10;
            n/=10;
        }
        System.out.println("even sum= "+ evenSum);
        System.out.println("odd sum= "+ oddSum);
    }
}
