import java.util.*;
public class ReverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            if(!Character.isLetter(ch[left])){
                left++;
            }
            else if(!Character.isLetter(ch[right])){
                right--;
            }
            else{
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(ch));
    }
}