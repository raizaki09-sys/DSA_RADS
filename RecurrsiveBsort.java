class Solution {
    public int[] bubbleSort(int[] nums) {
        B_sort(nums,nums.length);

        return nums;
    }
    public void B_sort(int[] nums,int n){
        if(n==1){
            return;
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
    B_sort(nums,n-1);

    }
}