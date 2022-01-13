class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] arr = new int[s.length()];
        int j = 0;
        while(j<s.length()){
            int count = 0;
            int row = startPos[0], col = startPos[1];
            for (int i = j; i < s.length(); i++) {

                char c = s.charAt(i);
                if (c == 'R' && col + 1 < n) {
                    col += 1;
                    count++;
                } else if (c == 'L' && col - 1 >=0) {
                    col -= 1;
                    count++;
                } else if (c == 'U' && row-1>=0) {
                    row -= 1;
                    count++;
                } else if (c == 'D' && row+1<n) {
                    row += 1;
                    count++;
                }
                else
                {
                    break;
                }

            }
            arr[j++] = count;
        }
        return arr;
    }
}
