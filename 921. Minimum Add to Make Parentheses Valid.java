class Solution {
    public int minAddToMakeValid(String s) {
        
        int ans = 0;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                if(stack.isEmpty()) ++ans;
                else
                   stack.pop();
         
            }
        }
        return ans+stack.size();
//         int openingNeeded = 0;
//         int closingNeeded = 0;
        
//         for(int i = 0; i < s.length(); i++){
//             if(s.charAt(i) == '('){
//                 closingNeeded++;
//             }else{
//                 if(closingNeeded == 0){
//                     openingNeeded++;
//                 }else{
//                     closingNeeded--;
//                 }
//             }
//         }
        
//         return openingNeeded + closingNeeded;
    }
}
