class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int tt=0;
        int t1=0;
        int t2=0;
        int[] snums=new int[nums1.length+nums2.length];
        while(t1<nums1.length && t2<nums2.length){
            int val=0;
            if(nums1[t1]<nums2[t2]){
                val=nums1[t1];
                t1++;
            }
            else if(nums1[t1]>nums2[t2]){
                val=nums2[t2];
                t2++;
            }
            else if(nums1[t1]==nums2[t2]){
                val=nums1[t1];
                t1++;
            }
            if(tt==0 || snums[tt-1]!=val){
                snums[tt]=val;
                tt++;
            }

        }
        if(t1<nums1.length){
            while(t1<nums1.length){
                int val=nums1[t1];
                if(snums[tt-1]!=val){
                    snums[tt]=val;
                    tt++;
                }
                t1++;
            }
            int[] fnums=new int[tt];
            for(int i=0;i<tt;i++){
                fnums[i]=snums[i];
            }
            return fnums;
        }
        else if(t2<nums2.length){
            while(t2<nums2.length){
                int val=nums2[t2];
                if(snums[tt-1]!=val){
                    snums[tt]=val;
                    tt++;
                }
                t2++;
            }
            int[] fnums=new int[tt];
            for(int i=0;i<tt;i++){
                fnums[i]=snums[i];
            }
            return fnums;
        }
        else{
            int[] fnums=new int[tt];
            for(int i=0;i<tt;i++){
                fnums[i]=snums[i];
            }
            return fnums;
        }
    }
}