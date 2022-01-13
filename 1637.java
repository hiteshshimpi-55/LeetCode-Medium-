class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] arr = new int[points.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        int max = 0;
        for(int i=1;i<arr.length;i++)
        {
            int num = arr[i]-arr[i-1];
            if(num>max)
                max = num;
        }
        return max;
    }
}
