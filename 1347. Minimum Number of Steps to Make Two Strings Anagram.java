    public int minSteps(String s, String t) {
        
        int[] letters = new int[26];
        List<Character> list = new ArrayList<>();
        // Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            // char c = s.charAt(i);
            // map.put(c,map.getOrDefault(c,0));
            letters[s.charAt(i)-'a']+=1;
            list.add(s.charAt(i));
        }
        int steps = 0;
        for(int i = 0;i<t.length();i++)
        {
            if(letters[t.charAt(i)-'a']!=0)
            {
                letters[t.charAt(i)-'a']--;
            }
            else if(letters[t.charAt(i)-'a']==0)
            {
                steps+=1;
            }
        }
        
        return steps;
    }
