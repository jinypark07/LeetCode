class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int returnNums[] = new int[2];
        int i_val=0;
        
        for(int i=0; i<nums.length; i++){
            i_val = nums[i];

            int j_val=0;
            
            for(int j=i; j<nums.length; j++){
                if(i!=j){
                    j_val = nums[j];
                    if(i_val + j_val == target){
                        returnNums[0] = i;
                        returnNums[1] = j;
                        break;
                    }
                }
            
            }
        }
        return returnNums;
    }
}