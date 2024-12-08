public class Solution {
    public string ReverseVowels(string s) {
        
        var result = s.ToCharArray();
        var vowels = new char[]{'a','A','e','E','i','I','o','O','u','U'};
        int i = 0; 
        int j = s.Length - 1;
        
        while(i<j){
            if(!vowels.Contains(result[i])){
                i++;
            }
            else if (!vowels.Contains(result[j])){
                j--;
            }else{
                char temp = result[i];
                result[i] = result[j];
                result[j] = temp;
                i++;
                j--;
            }
        }
        return new string(result);
    }
}