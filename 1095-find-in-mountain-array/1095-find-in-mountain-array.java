/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peakIndex = findPeakIndex(mountainArr, 0, n - 1);  
            int leftResult = binarySearch(mountainArr, target, 0, peakIndex, true);
    if (leftResult != -1) {
        return leftResult;
    }

    return binarySearch(mountainArr, target, peakIndex + 1, n - 1, false);
}

private int findPeakIndex(MountainArray arr, int left, int right) {
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (arr.get(mid) < arr.get(mid + 1)) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return left;
}

private int binarySearch(MountainArray arr, int target, int left, int right, boolean asc) {
    while (left <= right) {
        int mid = left + (right - left) / 2;
        int midVal = arr.get(mid);

        if (midVal == target) {
            return mid;
        }

        if ((midVal > target && asc) || (midVal < target && !asc)) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return -1;
}
}
 