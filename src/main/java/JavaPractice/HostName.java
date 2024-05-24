package JavaPractice;

import java.net.InetAddress;

public class HostName {
    public static void main(String[] args) {
        try{
            InetAddress ip=InetAddress.getByName("192.18.97.39");

            System.out.println("Host Name: "+ip.getHostName());
        }catch(Exception e){System.out.println(e);}
    }

}
