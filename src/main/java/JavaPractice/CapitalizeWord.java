package JavaPractice;


public class CapitalizeWord {
    public static void main(String[] args) {

        String message = "this is javatpoint";
        char[] charArray = message.toCharArray();
        boolean foundSpace = true;

        for(int i=0; i< charArray.length; i++)
        {
            if (Character.isLetter(charArray[i]))
            {
                if (foundSpace)
                {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else
            {
                foundSpace = true;
            }
        }
        System.out.println(charArray);

    }
}
