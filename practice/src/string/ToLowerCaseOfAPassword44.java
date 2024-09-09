package string;

public class ToLowerCaseOfAPassword44 {
    public static void main(String[] args) {
        String p="aBCD@123";
        String result="";
        for (int i=0;i<p.length();i++){
            if(p.charAt(i)>='a' && p.charAt(i)<='z')
                result=result+(char)(p.charAt(i)-32);
            else result+=p.charAt(i);
        }
        System.out.println(result);
    }
}
