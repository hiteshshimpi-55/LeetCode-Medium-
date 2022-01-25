class Solution {
    public int findTheWinner(int n, int k) {
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(i+1);
        }
        
        int index = 0;
        while(list.size()>1)
        {
            index++;
            if(index!=k)
            {
                push(list,list.get(0));
                pop(list);
            }
            else
            {
                pop(list);
                index=0;
            }
        }
        
        return list.get(0);
        
    }

    public void push(List<Integer> list,int num)
    {
        list.add(num);
    }
    public void pop(List<Integer> list)
    {
        list.remove(0);
    }
}
