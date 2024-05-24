package Auto;

public class Day14 {
    public static void main(String[] args) {

        String name = "RAVI KUMAR";
//        String reverse_name = "";
        StringBuilder reverse_name= new StringBuilder();
        for(int i=name.length()-1;i>=0;i--)
        {
            reverse_name.append(name.charAt(i));
//            reverse_name += name.charAt(i);
        }
        System.out.println(reverse_name);


        StringBuilder reverse_test = new StringBuilder(name);
        System.out.println(reverse_test.reverse());


//        char name2[] = {'R', 'A', 'V', 'I'};
//        String reverse_name2 = "";
//        for(int i=3;i>=0;i--)
//        {
//            reverse_name2 += name2[i];
//        }
//        System.out.println(reverse_name2);


    }
}
