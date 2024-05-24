package JavaPractice;

public class StringReversal {
    public static void main(String[] args) {

        String message = "this is javatpoint";
        StringBuilder reverse_message = new StringBuilder();
        for(int i=message.length()-1; i>=0 ; i--)
        {
            reverse_message.append(message.charAt(i));
        }
        System.out.println(reverse_message);
    }
}
