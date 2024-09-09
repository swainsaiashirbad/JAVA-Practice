package java8;

class Sample{
    Sample(String s){
        System.out.println("Sample class constructir excuted with argument:"+s);
    }
}
interface Inter{
    public Sample get(String s);
}
public class ConRef {
    public static void main(String[] args) {
        Inter i=Sample::new;
        Sample s1 = i.get("sai");
        Sample s2 = i.get("Jyothi");
    }
}
