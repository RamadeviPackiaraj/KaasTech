import java.util.*;
public class RemoveDuplicates{
    public static void FindDublicates(int[] arr){
        Map<Integer,Integer> mp=new HashMap<>();
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(count==1){
                mp.put(arr[i],count);
            }
            else{
                count++;
            }
        }
        System.out.println(mp.keySet());
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        FindDublicates(arr);
    }
}