class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        
        int inCap = capacity;
        int sum = 0;
        for(int i=0;i<plants.length;i++)
        {
            if(inCap<plants[i])
            {
                sum+=i*2;
                inCap = capacity;
            }
            inCap-=plants[i];
        }
        return sum+plants.length;
    }
}
