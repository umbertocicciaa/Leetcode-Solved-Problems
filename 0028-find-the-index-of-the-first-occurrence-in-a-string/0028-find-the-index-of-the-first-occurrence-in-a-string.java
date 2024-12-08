class Solution {
     public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; 
        }
        int i = 0; 
        int j = 0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
                if (j == needle.length()) {
                    return i - j + 1;
                }
            } else {
                i -= j;
                j = 0;
            }
            i++;
        }
        return -1;
    }
}