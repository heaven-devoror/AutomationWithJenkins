package JavaPractice;

public class CountNumberOfCharacters {
    public static void main(String[] args) {

        String message = "Hello World";
        int count = 0;
        for(int i=0; i< message.length(); i++)
        {
            if (Character.isLetter(message.charAt(i)) || Character.isSpaceChar(message.charAt(i)))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
