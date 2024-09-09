import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a decimal number");
        int d = scanner.nextInt();
        int noOfDigits = 1;
        int binary=0;
        while(d>0){
            int rem=d%2;
          binary+= rem*noOfDigits;
          noOfDigits*=10;
          d/=2;
        }
        System.out.println(binary);
//        System.out.println(d/2);
    }
}
