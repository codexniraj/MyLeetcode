class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] intArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = arr[i];
        }
        
        Arrays.sort(intArr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int bitCountA = Integer.bitCount(a);
                int bitCountB = Integer.bitCount(b);
                if (bitCountA != bitCountB) {
                    return bitCountA - bitCountB;
                } else {
                    return a - b;
                }
            }
        });
        
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = intArr[i];
        }
        
        return sortedArr;
    }
}
