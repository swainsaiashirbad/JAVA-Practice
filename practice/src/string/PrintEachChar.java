package string;

public class PrintEachChar {
    public static void main(String[] args) {
        String s="sai";
//        for (int i = 0; i <s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }
        char[] charArray = s.toCharArray();
        for(char c : charArray){
            System.out.println(c);
        }
    }
}
