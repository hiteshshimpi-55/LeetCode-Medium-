class Solution {
//     public int[] getMaximumXor(int[] nums, int maximumBit) {
        
//         int maxB =(int) Math.pow(2,maximumBit);
//         int n=nums.length,prev=0;
//         for(int i=0;i<n;i++)
//         {
//             prev^=nums[i];
//             nums[i]=prev;
//         }
//         int[] res = new int[n];
//         int index = 0;
//         for(int i=n-1;i>=0;i--)
//         {
//             res[index]=findK(nums[i],maxB);
//             index++;
//         }
        
//         return res;
//     }
    
//     public int findK(int num,int maxB)
//     {
//         int max = 0;
//         int n   = 0;
//         for(int i=0;i<maxB;i++)
//         {
//             int x = num^i;
//             if(x>max)
//             {
//                 max=x;
//                 n = i;
//             }
//         }
//         return n;
//     }
    public int[] getMaximumXor(int[] nums, int maximumBit) {
       for(int i=1; i<nums.length; i++)
           nums[i] ^= nums[i-1];
        
       int k = (int)Math.pow(2, maximumBit)-1;
        
       int[] res = new int[nums.length]; 
       int index = 0;
       for(int i=nums.length-1; i>=0; i--){   
           res[index] = nums[i] ^ k;
           index++;
       }
        return res;
    }

}
