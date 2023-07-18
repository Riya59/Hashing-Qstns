import java.util.HashSet;
import java.util.Scanner;

public class disjointset {
    public static boolean checkDisjoint(int arr1[], int arr2[]){
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for(int i=0;i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        for(int j=0;j<n2;j++){
            arr2[j] = sc.nextInt();
        }

        if(checkDisjoint(arr1,arr2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
