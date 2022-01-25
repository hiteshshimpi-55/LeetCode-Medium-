class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> list  = new ArrayList<>();
        int n = pattern.length();
        for(int i = 0;i<words.length;i++)
        {
            
            Map<Character,Character> map = new HashMap<>();
            for(int j=0;j<n;j++)
            {        
                if(!map.containsValue(words[i].charAt(j)))
                {
                   map.put(pattern.charAt(j),words[i].charAt(j));
                }
            }
            StringBuilder sc = new StringBuilder();
            for(int j=0;j<n;j++)
            {
                sc.append(map.get(pattern.charAt(j)));
            }
            
            if(sc.toString().equals(words[i]))
            {
                list.add(words[i]);
            }
        }
        
        return list;
     }
}
