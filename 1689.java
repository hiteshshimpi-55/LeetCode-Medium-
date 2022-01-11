class Solution {
    public int minPartitions(String n) {
        
        char max = '0';
        for(char c:n.toCharArray())
        {
            
            if(c>max)
            {
                max = c;
            }
        }
        return max-'0';
    }
}
