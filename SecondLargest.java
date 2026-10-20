class Solution {
    public int secondLargestElement(int[] nums) {
        int s_largest=Integer.MIN_VALUE;
        int largest=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                int temp=largest;
                largest=nums[i];
                s_largest=temp;
            }
            else if(nums[i]>s_largest && nums[i]!=largest){
                s_largest=nums[i];
            }
        }
        return s_largest==Integer.MIN_VALUE?-1:s_largest;
    }
}