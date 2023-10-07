class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for(int i = 0;i<nums.length;i++)
        {
            mp.put(nums[i],i);
        }

        for(int i = 0;i<nums.length;i++){
            int tn = target - nums[i];
            if(mp.get(tn) != null && mp.get(tn) != i){
                ans[0] = i;
                ans[1] = mp.get(tn);
                break;
            }
        }

        return ans;
    }
}