package java8;
public class MethodRef {

    public static void main(String[] args) {
        Runnable r=new Test()::myThread;
        Thread thread = new Thread(r);
        thread.start();
        for (int i=1;i<11;i++)  {
            System.out.println("main thread");
        }

    }}
