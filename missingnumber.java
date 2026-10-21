class Solution {
    public int missingNumber(int[] nums) {
        int largest=nums[0];
        int smallest=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
            else if(nums[i]<smallest){
                smallest=nums[i];
            }
        }
        if(smallest != 0){
            return 0;
        }
        
        for(int j=smallest;j<=largest;j++){
            boolean flag=false;
            for(int k=0;k<nums.length;k++){
                if(nums[k]==j){
                    flag=true;
                }
                }
                if(flag==false){
                    return j;
            }

        }
        
        return largest+1;
    }
}