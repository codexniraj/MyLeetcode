class Solution {
public static void sortColors(int[] nums) {
    int r = 0;
    int w = 0;
    int b = 0;
    
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            r++;
        } else if (nums[i] == 1) {
            w++;
        } else {
            b++;
        }
    }
    
    int i = 0;
    
    while (r > 0) {
        nums[i] = 0;
        i++;
        r--;
    }
    
    while (w > 0) {
        nums[i] = 1;
        i++;
        w--;
    }
    
    while (b > 0) {
        nums[i] = 2;
        i++;
        b--;
    }
}
}