package string;

public class NoOfOccerenceInAString {
    public static void main(String[] args) {
        String s="Engineering";
        String sl = s.toLowerCase();
        char c='g';
        int count=0;
        for (int i=0;i<sl.length();i++){
            if (sl.charAt(i)==c)count++;
        }
        System.out.println("char e occers: "+count+" times");
    }
}
