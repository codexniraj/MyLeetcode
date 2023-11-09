class Solution {
    public int countHomogenous(String s) {
        int count = 0;   
        int maxLength = (int)1e9 + 7;   
        
        int length = s.length();
        int consecutiveChars = 0;   
        
        for (int i = 0; i < length; i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                consecutiveChars++;
            } else {
                consecutiveChars = 1;
            }
            
            count = (count + consecutiveChars) % maxLength;
        }
        
        return count;
    }
}