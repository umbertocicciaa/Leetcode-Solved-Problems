class Solution(object):
    def reverseString(self, s):
        stack = []
        for c in s:
            stack.append(c)
        for i in range(len(s)):
            s[i]=stack.pop()
            