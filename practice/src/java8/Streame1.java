package java8;
import java.util.ArrayList;
public class Streame1 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(751018);
        l.add(1999);
        l.add(2019);
        l.add(74285);
        l.add(754245);
        Integer i = l.stream().max((l1, l2) -> -l1.compareTo(l2)).get();
        System.out.println(i);

    }
}
