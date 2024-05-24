package JavaPractice;

public class ToggleCharacters {
    public static void main(String[] args) {

        String message = "this is javatpoint".toUpperCase();
//        message = message.toUpperCase();

        char[] charArray = message.toCharArray();
        boolean foundSpace = true;

        for (int i=0; i<charArray.length; i++)
        {
            if (Character.isLetter(charArray[i]))
            {
                if (foundSpace)
                {
                    charArray[i] = Character.toLowerCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        System.out.println(charArray);
    }
}
