class Solution {
    public int[] findArray(int[] pref) {
        int xor = pref[0];
        for(int i = 1;i<pref.length;i++)
        {
            int temp = xor ^ pref[i];
            xor = pref[i];
            pref[i] = temp;
        }
        return pref;
    }
}