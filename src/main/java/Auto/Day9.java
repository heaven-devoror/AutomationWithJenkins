package Auto;

public class Day9 {
    public static void main(String[] args) {

        String country = "India";
        // For loop
        /*for(int i=0; i<=50; i++)
        {
            System.out.println(country);
        }*/

        int [] marksArr = new int[]{ 14, 54, 66, 98, 22, 43, 78, 89, 23, 12};
        for(int i=0; i<10; i=i+2)
        {
            System.out.println((i+1) + ": " + marksArr[i]);
        }


        /*int i=0;
        while (i<10)
        {
            System.out.println((i+1) + ": " + marksArr[i]);
            i=i+1;
        }
        */

        /*int i=0;
        do
        {
            System.out.println((i+1) + ": " + marksArr[i]);
            i=i+1;
        }while (i<10);*/



        // While loop
        /*int i=0;
        while(i<50)
        {
            System.out.println(country);
            i++;
        }*/

        //do-while loop
        /*int i=60;
        do
        {
            System.out.println(country);
            i++;
        }while(i<50);
        */
    }
}
