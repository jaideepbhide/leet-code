class Solution {
    public int[] twoSum(int[] nums, int target) {
        for ( int i = 0;i < nums.length; i++){
            for (int j = 0;j <nums.length; j ++){
                if (j != i){
                    if ( (nums[i] + nums[j]) == target){
                        int[] a = new int[]{i,j};
                        return a;
                    }
                }
            }
        }
        
        return nums;
        
    }
}