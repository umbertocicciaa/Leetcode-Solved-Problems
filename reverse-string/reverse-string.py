class Solution(object):
    def reverseString(self, s):
        slen=len(s)
        for i in range(slen//2):
            if s[i]!=s[slen-1-i]:
                tmp=s[slen-1-i]
                s[slen-1-i]=s[i]
                s[i]=tmp
        