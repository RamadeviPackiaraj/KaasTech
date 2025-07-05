import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;
public class IPAddressValidator {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    if(isValidIPAddress(s)){
        System.out.println(s+" is the valid Ip Address");
    }else{
        System.out.println(s+" is not a valid Ip Address");
    }
    try{
        InetAddress myip=InetAddress.getLocalHost();
        System.out.println(myip);
        System.out.println(myip.getHostName());
        System.out.println(myip.getHostAddress());
    }
    catch(Exception ex){
        System.out.println(ex.getMessage());
    }
}
public static boolean isValidIPAddress(String s){
    try{
        InetAddress add=InetAddress.getByName(s);
        return true;
    }
    catch(UnknownHostException ex){
        return false;
    }
}
}
//0.0.0.0.0
0.0.0.0.0 is not a valid Ip Address
Check/172.17.0.92
Check
172.17.0.92