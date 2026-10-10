class Solution {
    public int[] mergeSort(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;
    }
    public void divide(int[] nums,int lb,int ub){
        if(lb>=ub){
            return;
            }

            int mid=(lb+ub)/2;
            divide(nums,lb,mid);
            divide(nums,mid+1,ub);
            merge(nums,lb,mid,ub);
            }
    public void merge(int[] nums,int lb,int mid,int ub){
          int i=lb;
          int j=mid+1;
          int k=0;
          int[] temp=new int[ub-lb+1];
          while(i<=mid && j<=ub){
            if(nums[i]<nums[j]){
                temp[k]=nums[i];
                i++;
            }
            else{
                temp[k]=nums[j];
                j++;
            }
            k++;
            }
            if(i>mid){
                while(j<=ub){
                    temp[k]=nums[j];
                    j++;
                    k++;
                }  
            }
            else{
                while(i<=mid){
                    temp[k]=nums[i];
                    i++;
                    k++;
                }
            }
            for(int h=0;h<temp.length;h++){
            nums[lb+h]=temp[h];
          }
        
        }
        }
        


    