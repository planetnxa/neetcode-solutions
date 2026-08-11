class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashy = new HashMap<>();
        for (int i = 0; i < nums.length;i++){
            hashy.put(nums[i],i);

        }
        
        for (int i = 0; i < nums.length;i++){
            int newNew = target - nums[i];
            if(hashy.containsKey(newNew) && hashy.get(newNew) != i){
                return new int[] {i, hashy.get(newNew)};
            }

        }
        return new int[0];

    }
}
