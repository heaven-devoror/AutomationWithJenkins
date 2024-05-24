package JavaPractice;

public class PalindromeCheck {
    public static void main(String[] args) {

        String message = "pap";
        String reverse = "";
        for(int i=message.length()-1; i>=0; i--)
        {
            reverse += message.charAt(i);
        }

        if(message.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
