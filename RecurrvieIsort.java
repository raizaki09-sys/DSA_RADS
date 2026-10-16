class Solution {
    public int[] insertionSort(int[] nums) {
        
        I_sort(nums,1);
        return nums;
    }
    public void I_sort(int[] nums,int i){
        if(i==nums.length){
            return;
        }
        int key=nums[i];
        int j=i-1;
        while(j>=0 && nums[j]>key){
            nums[j+1]=nums[j];
            j--;
        }
        nums[j+1]=key;

        I_sort(nums,i+1);
    }
}