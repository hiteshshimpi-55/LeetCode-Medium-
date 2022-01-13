class Solution {
    public int numberOfBeams(String[] bank) {
        int[] arr = new int[bank.length];
        for (int i = 0; i < bank.length; i++) {
            int count = 0;
            for (int j = 0; j < bank[i].length(); j++) {

                if(bank[i].charAt(j)=='1')
                {
                    count+=1;
                }
            }
            arr[i]=count;
        }
        int result = 0;
        int prev = arr[0];
        for (int i = 1; i < arr.length ; i++) {
           if(arr[i] != 0)
           {
               result+=arr[i]*prev;
               prev = arr[i];
           }
        }
        return result;
    }
}
