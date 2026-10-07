class Solution {
    public int[] selectionSort(int[] nums) {
        int n=0;
        int l=nums.length;
        while(n<(nums.length-1)){
            int index=((nums.length)-l);
            int small=nums[((nums.length)-l)];
            for(int i=(nums.length)-l;i<nums.length;i++){
                if(nums[i]<small){
                    small=nums[i];
                    index=i;
                }
            }
            int temp=nums[((nums.length)-l)];
            nums[((nums.length)-l)]=small;
            nums[index]=temp;
            l=l-1;
            n=n+1;
            }
            return nums;
        }

    }