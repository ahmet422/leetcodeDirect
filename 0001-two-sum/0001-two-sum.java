class Solution {
    public int[] twoSum(int[] nums, int target) {
          int[] indexes = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                indexes[0] = map.get(target - nums[i]);
                indexes[1] = i;
                return indexes;
            }else{
                map.put(nums[i], i);                
            }
        }
        return String = "Hi";
        return indexes;
    }
}
