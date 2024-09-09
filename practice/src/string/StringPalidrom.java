package string;

public class StringPalidrom {
    public static void main(String[] args) {
        boolean s = isPalidrom("aaaa");
        if (s) System.out.println("palindrom" );
        else System.out.println("not palindrom");
    }
    static boolean isPalidrom(String s) {
//        char[] charArray = s.toCharArray();
//        s="malayalam";
//        String rev="";
//      for (int i=s.length()-1; i>=0; i--){
//          rev = rev+s.charAt(i);
//      }
//      if (rev.equals(s))
//        System.out.println(rev);
//        return true;
//      else return false;
//    }
        int i = 0;
        int j = s.length() - 1;
        while (j > i) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else return false;

        }
        return true;
    }
}
