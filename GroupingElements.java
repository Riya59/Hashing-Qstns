// Group all the occurrences of elements order by their first occurrence

import java.util.HashMap;
import java.util.Scanner;
public class GroupingElements {
    public static void orderedGroup(int arr[]){
        HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();

        for(int i=0;i<arr.length;i++){
            Integer prevCount = map.get(arr[i]);
            if(prevCount == null){
                prevCount = 0;
            }
            map.put(arr[i], prevCount+1);
        }

        for(int i=0;i<arr.length;i++){
            Integer count = map.get(arr[i]);
            if(count != null){
               for(int j=0;j<count;j++){
                System.out.print(arr[i]+" ");

               }
               map.remove(arr[i]);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        orderedGroup(arr);
        sc.close();
    }
}
