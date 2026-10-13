class Solution {
    public int[] quickSort(int[] nums) {
        int lb=0;
        int ub=nums.length-1;

        int[] result=qsort(nums,lb,ub);

        return result;
    }
    public int[] qsort(int[] nums,int lb,int ub){
        if(lb<ub){
            int p=partition(nums,lb,ub);

            qsort(nums,lb,p-1);
            qsort(nums,p+1,ub);
        }
        return nums;
    }
    public int partition(int[] nums,int lb,int ub){
        int start =lb+1;
        int end = ub;
        int pivot =lb;
        while(start<=end){
            while(start <= ub && nums[start]<=nums[pivot]){
                start++;
            }
            while(end > lb && nums[end]>nums[pivot]){
                end--;
            }
            if(end>start){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
            }
        }
        int temp=nums[end];
        nums[end]=nums[pivot];
        nums[pivot]=temp;

        return end;
    }
}