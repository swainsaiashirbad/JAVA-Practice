import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two numbers");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int n=1;
        while (true){
          if (n%i==0 && n%j==0)
             break;
          n++;
        }
        System.out.println(n+": is the common Multiplecation");
    }
}
