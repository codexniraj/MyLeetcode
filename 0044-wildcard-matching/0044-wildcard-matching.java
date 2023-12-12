class Solution {
    public boolean isMatch(String s, String p) {
     if (p == null || p.length() == 0) return (s == null | s.length() == 0);
		if (p == "*") return true;
		int ls = s.length(), lp = p.length();
		int i = 0, j = 0;
		int star = -1, match = 0;
		while (i < ls){
			if(j < lp && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')){
				i++;
				j++;
			}else if (j < lp &&p.charAt(j) == '*'){
				star = j;
				match = i;
				j++;
			}else if (star != -1) {
				i = ++match;
				j = star+1;
			}
			else return false;
		}
		while (j < lp){
			if (p.charAt(j) != '*') return false;
			j++;
		}
		return j == lp; 
    }
}