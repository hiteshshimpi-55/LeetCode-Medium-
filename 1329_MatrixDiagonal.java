class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        //row = 0
        for(int col=0;col<n;col++)
        {
            sortDiagonal(mat,0,col,m,n);
        }
        //col = 0
        for(int row=1;row<m;row++)
        {
            sortDiagonal(mat,row,0,m,n);
        }
        
        return mat;
    }
    public void sortDiagonal(int[][] mat,int row,int col,int m,int n)
    {
        // List<Integer> list = new ArrayList<>();
        int[] arr = new int[101];
        int r = row;
        int c = col;
        while(r<m && c<n)
        {
            // list.add(mat[r][c]);
            arr[mat[r][c]]++;
            r++;
            c++;
        }
        // Collections.sort(list);
        r = row;
        c = col;
        // int index = 0;
        for(int i=1;i<101;i++)
        {
            if(arr[i]>0)
            {
                int count = arr[i];
                while(count-->0)
                {
                    mat[r][c] = i;
                    r++;
                    c++;
                }
                
            }
        }
        // while(r<m && c<n)
        // {
        //     mat[r][c] = list.get(index);
        //     r++;
        //     c++;
        //     index++;
        // }
    }
}
