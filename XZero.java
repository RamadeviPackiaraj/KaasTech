import java.util.*;
public class XZero{
    public static int FindXcount(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='x'){
                i=i+2;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(FindXcount(str));
    }
}//