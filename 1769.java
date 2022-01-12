class Solution {
    public int[] minOperations(String boxes) {
//         for(int i=0;i<n;i++)
//         {
//             int sum = 0;
//             for(int j = 0;j<n;j++)
//             {
//                 if(j!=i && boxes.charAt(j)=='1')
//                 {
//                     sum+=Math.abs(i-j);
//                 }
//             }
//             ans[i] = sum;

//         }
//         return ans;
        int n = boxes.length();
        int[] ans = new int[n];
        int indexLeftSum = 0;
        int countLeft = 0;
        int indexRightSum=0;
        int countRight = 0;
        for(int i=0;i<n;i++)
        {
           if(boxes.charAt(i)=='1')
           {
               indexRightSum+=i;
               countRight++;
           }
        }

        for(int i = 0;i < n;i++)
        {
            ans[i] = Math.abs(indexLeftSum-(i*countLeft)) + Math.abs(indexRightSum-(i*countRight));
            if(boxes.charAt(i)=='1')
            {
               indexLeftSum +=i;
               indexRightSum-=i;
               countLeft++; 
               countRight--; 
            }
        }
        return ans;
    }
}
