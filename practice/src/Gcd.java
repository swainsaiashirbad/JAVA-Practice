import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        // Greatest Common divisior
        Scanner scanner = new Scanner(System.in);
        System.out.println("entire two numbers");
        int a= scanner.nextInt();
        int b = scanner.nextInt();
        int i =1;
        int gcd = 1;
        while (i<=a && i<=b ){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
            i++;
        }
        System.out.println(gcd+": is the common divisior of "+a+" and "+b);
    }
}
