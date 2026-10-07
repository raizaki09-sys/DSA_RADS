class Solution {
    public int[] bubbleSort(int[] nums) {
        int n=0;
        while(((nums.length)-1)>n){
            for(int i=0;i<nums.length-1;i++){
                if((nums)[i]>nums[i+1]){
                    int temp =nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
            n++;
        }
        return nums;
    }
}