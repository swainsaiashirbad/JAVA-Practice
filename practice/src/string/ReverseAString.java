package string;

public class ReverseAString {
    public static void main(String[] args) {
        String s="abcd";
        String r="";
        for (int i=s.length()-1;i>=0;i--){
           r=r+ s.charAt(i);
        }
        System.out.println(r);
    }
}
