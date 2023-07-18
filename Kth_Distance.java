class Solution {
    boolean checkDuplicatesWithinK(int[] arr, int n, int k) {
        // code here
        HashSet<Integer>set = new HashSet<>();
        for(int i=0; i<n;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
            
            if(i>=k){
                set.remove(arr[i-k]);
            }
        }
        return false;
    }
}
