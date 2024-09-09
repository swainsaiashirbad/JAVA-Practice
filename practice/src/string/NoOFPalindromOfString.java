package string;

public class NoOFPalindromOfString {
    public static void main(String[] args) {
        String s="Malayalam";
        for (int i=0;i<s.length();i++){
            for (int j=i+2;j<s.length();j++){
                String substring = s.substring(i, j);
                if (isPalindrom(substring)) System.out.println(substring);
            }
        }
    }
    public static boolean isPalindrom(String s){
        String ls = s.toLowerCase();
        char[] charArray = s.toCharArray();
        int i=0,j=charArray.length-1;
        while (j>i){
            if(charArray[i]!=charArray[j]) return  false;
            i++;
            j--;
        }
        return true;
    }
}
