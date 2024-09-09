package java8;
interface Interf{
    public void add(int a,int b);
}
public class MethodRef2 {
    public static void sum(int x,int y){
        System.out.println("sum is:"+(x+y));
    }
    public static void main(String[] args) {
        Interf i=(a,b)-> System.out.println("sum= "+(a+b));
        i.add(30,40);
       Interf sum = MethodRef2::sum;
       sum.add(50,100);
    }
}
