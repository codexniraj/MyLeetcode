class Solution {

public List<String> wordBreak(String s, List<String> wordDict) {
List<String> res = new ArrayList<>();
    Set<String> set = new HashSet<>(wordDict);
    for(int i = 1;i <= s.length();i++){
        String sub = s.substring(0, i);
        if(set.contains(sub)){
            List<String> tmp = wordBreak(s.substring(i, s.length()), wordDict);
            for(String x : tmp)
                res.add(sub+" "+x);
            if(tmp.size()==0 && i==s.length())
                res.add(sub);
        }
    }
    return res;
} 
}