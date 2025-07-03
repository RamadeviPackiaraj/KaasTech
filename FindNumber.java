import java.util.*;
public class FindNumber{
    public static Stack<Integer> Find(int[] arr){
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                st.push(arr[i]+arr[i-1]);
            }
            else if(arr[i]!=0){
                st.push(arr[i]);
            }
        }
        while(st.size()<arr.length){
            st.push(0);
        }
        return st;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Find(arr));
    }
}// 2 2 0 4 0 8 output 4 4 8 0 0 0