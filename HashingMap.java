import java.util.HashMap;
import java.util.*;

public class HashingMap{
    public static void main(String args[]){

        //HashMaps are unordered maps...output can be in any order not depend upon the order of insertion

        //country(key), population(value)
        HashMap<String, Integer>map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        //print map
        System.out.println(map);
        //output -- {China=150, US=30, India=120}

        map.put("China", 180);
        System.out.println(map); // 150 is updated to 180--china value


        //Search
        //containsKey() return true or false 
        if(map.containsKey("Indonesia")){
            System.out.println("Key present in map");
        }
        else{
            System.out.println("Key not present in map");
        }
        
        //get() return the value of key if key is existing and null if key is non existing
        System.out.println(map.get("China")); //Case of key existing and returns the value of that key
        System.out.println(map.get("Indonesia")); //Case of non existing key and returns null 


        //Iterator
        // int arr[] = {12,15,18};
        //first way to print is using for loop 
        //second way
        // for(int val : arr){
        //     System.out.print(val+" ");
        // }
        // System.out.println();

        //Map.entrySet() will give the set view of map containing all the pairs and one by one all pairs will come into 'e' --Map.Entry<String,Integer>e

        //iteration through entry set
        for( Map.Entry<String, Integer>e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //iteration through key set
        //keySet() used to make the set of keys
        Set<String>keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        //remove pair
        map.remove("China"); //remove(keyname)
        System.out.println(map);
    }
}