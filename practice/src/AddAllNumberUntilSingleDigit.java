import java.util.Scanner;

public class AddAllNumberUntilSingleDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int  n = scanner.nextInt();
        int sum=0;
        do {
            sum=0;
            while (n>0) {
                sum=sum+n%10;
                n/=10;
            }
                System.out.println("sum ="+sum);
            n=sum;
        }
        while (sum>9) ;
    }
}
