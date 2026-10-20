class Solution {
    public void rotateArrayByOne(int[] nums) {
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
        for(int j=0;j<nums.length;j++){
            System.out.println(nums[j]);
        }
    }
}