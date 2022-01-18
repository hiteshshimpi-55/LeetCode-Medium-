class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> list = new ArrayList<>();
        
        for(int i=0;i<l.length;++i)
        {
            int start = l[i];
            int end   = r[i];
            list.add(isChangeable(Arrays.copyOfRange(nums,start,end+1)));
 
        }
        return list;
        
    }
    
    public boolean isChangeable(int[] arr)
    {
        if(arr.length < 2)return false;
        if(arr.length == 2)return true;
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for(int i=1;i<arr.length-1;++i){
            if(arr[i+1]-arr[i]!=diff)
            {
                return false;
            }
        }
        return true;
    }
}
