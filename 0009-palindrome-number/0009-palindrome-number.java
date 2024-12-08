class Solution {
    public boolean isPalindrome(int x) {
        String s = ""+x;
        char[] c = s.toCharArray();
        
        for(int i=0;i<c.length/2;i++){
            if(c[i] != c[c.length-i-1])
                return false;
        }
        return true;
    }
}