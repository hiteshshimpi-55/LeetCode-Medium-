class Solution {
    public List<Integer> partitionLabels(String s) {
        
        List<Integer> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),i);
        }
        int prev = -1;
        int max  = 0;
        for(int i=0;i<s.length();i++)
        {
            max = Math.max(map.get(s.charAt(i)),max);
            if(max==i)
            {
                list.add(max-prev);
                prev=i;
            }
        }
        return list;
    }
}
