class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mappd = new HashMap<>();

        int neededVal = 0;
        for(int i = 0; i<nums.length;i++){
            neededVal = target - nums[i];
            if (mappd.containsKey(neededVal)) {
                return new int[] {mappd.get(neededVal), i};
            }
            mappd.put(nums[i], i);
        }

        return new int[0];
    }
}