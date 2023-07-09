class Solution {
    public static String[] map ={".",".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
"tuv", "wxyz"};
   
    public List<String> letterCombinations(String digits) {
        ArrayList<String> comb = new ArrayList<>();
          if(digits.length()==0){
            return comb;
        }
        lettercomb(digits,"",comb);
        System.out.println(comb);
        return comb;
    }

    public static void lettercomb(String digits,String ans, List<String> comb){
        if(digits.length()==0){
            comb.add(ans);
            return;
        }
        String key = map[digits.charAt(0)-48];
        for(int i=0;i<key.length();i++){
            lettercomb(digits.substring(1),ans+key.charAt(i),comb);
        }
    }
}