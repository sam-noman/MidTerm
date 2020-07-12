package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        getPalindrome();
    }


    public static void getPalindrome(){
        String str = "1221";
        StringBuffer newStr =new StringBuffer();
        for(int i = str.length()-1; i >= 0 ; i--) {
            newStr = newStr.append(str.charAt(i));
        }
        if(str.equalsIgnoreCase(newStr.toString())) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
