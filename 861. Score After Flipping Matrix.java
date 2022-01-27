class Solution {
    public static int matrixScore(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0)
                changeRow(grid, i);
        }

        for (int i = 0; i < grid[0].length; i++) {
            int oC = 0;
            int zC = 0;
            for(int j =0;j<grid.length;j++)
            {
                if(grid[j][i]==1)
                {
                    oC++;
                }
                else
                {
                    zC++;
                }
            }
            if (zC>oC)
            {
                changeCol(grid,i);
            }    
        }

        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            StringBuilder sc = new StringBuilder();
            for (int j = 0; j < grid[i].length; j++) {
              sc.append(grid[i][j]);
            }
            sum += toDecimal(sc.toString());
        }

        return sum;
    }
    public static int toDecimal(String sc)
    {
        int num = 0;
        int p = 0;
        for (int i = sc.length()-1; i>=0 ; i--) {
            int number = (int) ((int)Integer.parseInt(sc.charAt(i)+"")*Math.pow(2,p));
            num+=number;
            p++;
        }
        return num;
    }
    public  static void changeRow(int[][] grid,int row)
    {
        for(int i=0;i<grid[row].length;i++)
        {
            if(grid[row][i]==1)
            {
                grid[row][i]=0;
            }
            else
            {
                grid[row][i]=1;
            }
        }
    }
        
    public static void changeCol(int[][] grid,int col)
        {
            for(int i=0;i<grid.length;i++)
            {
                if(grid[i][col]==1)
                {
                    grid[i][col]=0;
                }
                else
                {
                    grid[i][col]=1;
                }
            }
        }
}
