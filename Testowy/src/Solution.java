
import java.util.Arrays;

class Solution {
    public int solution(int[] A) {        
        int[] maxStartingHere = new int[A.length];
        int[] maxEndingHere = new int[A.length];
        int maxSum = 0, len = A.length;

        for(int i = len - 2; i > 0; --i ) {
        	//System.out.println(i);
            maxSum = Math.max(0, A[i] + maxSum);
            maxStartingHere[i] = maxSum;
            //System.out.println(maxSum);
        }
        System.out.println(Arrays.toString(maxStartingHere));
        
        maxSum = 0;
        for(int i = 1; i < len - 1; ++i ) {
        	//System.out.println(i);
            maxSum = Math.max(0, A[i] + maxSum);
            maxEndingHere[i] = maxSum;
            //System.out.println(maxSum);
        }
        System.out.println(Arrays.toString(maxEndingHere));

        int maxDoubleSlice = 0;
        for(int i = 0; i < len - 2; ++i) {
        	//System.out.println(i);
            maxDoubleSlice = Math.max(maxDoubleSlice, maxEndingHere[i] + maxStartingHere[i+2]);
            //System.out.println(maxEndingHere[i]);
            //System.out.println(maxStartingHere[i+2]);
            //System.out.println(maxDoubleSlice);
        }

        return maxDoubleSlice;

    }
    public static void main(String[] args){
    	int[] A = {3,2,6,-1,4,5,-1,2};
    	Solution s = new Solution();
    	System.out.println("wynik: " + s.solution(A));
    }
}