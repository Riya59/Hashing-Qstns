import java.util.HashSet;
import java.util.Iterator;

public class Hashing{
    public static void main(String args[]){
        //creating
        HashSet<Integer>set = new HashSet<>();
        
        //insert
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        //set is unordered data structure as it does not gurantee that the order will remain constant over time
        //size
        //set is named as unordered set in c++
        System.out.println("Size of set is : "+ set.size());

        //Print all elements -- give output in form of array
        // System.out.println(set);

        //Search - contains
        // if(set.contains(10)){
        //     System.out.println("Set contains value");
        // }
        // if(!set.contains(60)){
        //     System.out.println("Does not contain");
        // }

        // //Delete
        // set.remove(10);
        // if(!set.contains(10)){
        //     System.out.println("does not contain 10");
        // }
        
        //Iterator is a speacial method in sets to traverse elements of sets as sets do not have index
        //Iterator -- variable to traverse the set-- or array--'i' used in loops to traverse array

        Iterator it = set.iterator();
        //Iterator has two functions--hasNext, next
        //it.next() will return the value next to null if first it is null
        //it.hasNext() will return true or false --- it will return true if there is a value nextto that on which iterator is pointing otherwise false

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
