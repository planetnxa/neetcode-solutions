class Solution {
    public boolean hasDuplicate(int[] nums) {
        // could do a for loop that checks each, or two pointers
        // orrr duplicate the array without the given position, then search

        ArrayList<Integer> nums2 = new ArrayList();
            for (int i = 0; i < nums.length;i++){
                if (!nums2.contains(nums[i])){
                    nums2.add(nums[i]);
                }
                else{
                    return true;
                }
            }
            return false;

        //faster to make 2 pointers tbf
        // int p = nums.length;  // 6, 7 values in our array
        // for (int i = 0; i < p; i++){ 
        // for (int j = 1; j < p; j++){
        //     if(nums[i] == nums[j] && i !=j){
        //         return true;
        //     }
            
        // }
        
        // }
        // return false;
        
    }
}