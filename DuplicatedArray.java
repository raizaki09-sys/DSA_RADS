class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                for(int j=i+1;j<n-1;j++){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                i--;
                n--;
            }
        }
        return n;
    }
}