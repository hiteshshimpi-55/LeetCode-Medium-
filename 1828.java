//MYSOLUTION
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        
        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int count = 0;
            int x2 = queries[i][0];
            int y2 = queries[i][1];
            double r  = queries[i][2];
            for(int j=0;j<points.length;j++)
            {
                int x1 = points[j][0];
                int y1 = points[j][1];
                double dis = Math.hypot(Math.abs(x2-x1),Math.abs(y2-y1));
                if(dis<=r)
                    count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}
// class Solution {
//     public int[] countPoints(int[][] points, int[][] queries) {
//         int len = queries.length;
//         int[] ans = new int[len];
         
//         for(int i=0;i<len;i++){
//             int count = 0;
//             int radius2 = queries[i][2] * queries[i][2];
//             for(int p=0; p<points.length;p++){
//                 int[] point = points[p];
//                 if(radius2(point,queries[i]) <= radius2){
//                     count += 1;
//                 }
//             }
//             ans[i] = count;
//         }
        
//         return ans;
//     }
    
//     private int radius2(int[] point, int[] center){
//         int x = point[0] - center[0];
//         int y = point[1] - center[1];
//         return x*x + y*y;
//     }
// }
