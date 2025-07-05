import java.util.*;
public class CurrencyCounter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int[] arr={500,200,100,50,20,10,5,2,1};
        Map<Integer,Integer> mp=new LinkedHashMap<>();
        for(int denom:arr){
            if(amount>=denom){
                int count=amount/denom;
                mp.put(denom,count);
                amount%=denom;
            }
        }
       for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
        }    }
}