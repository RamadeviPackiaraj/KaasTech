import java.util.*;
public class TopFrequencyFinder{
    public static List<Integer> FindAccurance(int[] arr){
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
              mp.put(arr[i], mp.get(arr[i]) + 1);
            }
             else{
             mp.put(arr[i],1);
             }
        }
       // System.out.println(mp);
        List<Map.Entry<Integer,Integer>>list=new ArrayList<>(mp.entrySet());
//Index 0 → Entry (1=2)
//Index 1 → Entry (2=3)
//Index 2 → Entry (3=1)

        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        //[1=2,2=3,3=4,5=3]        //[5=5, 3=4, 2=3, 1=2]
        List<Integer> top3=new ArrayList<>();
        for(int i=0;i<Math.min(3,list.size());i++){
            top3.add(list.get(i).getKey());
        }
        return top3;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(FindAccurance(arr));
    }
}//Input  1 5 1 2 2 5 2 3 5 3 3 5 3 5
//[5=5, 3=4, 2=3, 1=2]
//output  [5, 3, 2]
