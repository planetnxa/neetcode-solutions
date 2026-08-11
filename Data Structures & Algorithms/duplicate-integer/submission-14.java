class Solution {
    public boolean hasDuplicate(int[] nums) {
        // for (int i = 0; i<nums.length;i++){
        //     for (int j = 0;j<nums.length;j++){
        //         if (nums[i] == nums[j] && i!=j){
        //         return true;
        //     }
            
        // }
            
        // }
        // return false;

        Set<Integer> hashySet = new HashSet<>();
        for (int i = 0;i<nums.length;i++){
            if (hashySet.contains(nums[i])){
                return true;
            }
            hashySet.add(nums[i]);
        }
        return false;
    }
}

// how would i do this with a hash map