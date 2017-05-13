import java.util.*;
public class Solution2 {
	public int solution(int[] A) {
		if(A.length < 3){
			return 0;
		}
		ArrayList<Integer> peaks = new ArrayList<Integer>();
		for(int i = 1; i < A.length-1; i++){
			if(A[i] > A[i-1] && A[i] > A[i+1]) peaks.add(i);
		}
		for (int size=1; size<=A.length; size++){
			if(A.length%size != 0){
				continue;
			}
			int find = 0;
			int groups = A.length/size;
			for( int peakIdx: peaks){
				if(peakIdx/size > find){
					break;
				}
				if(peakIdx/size == find) {
					find++;
				}
			}
			if(find == groups) {
				return groups;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int[] A = {1,2,3,4,3,4,1,2,3,4,6,2};
		Solution2 s = new Solution2();
		System.out.println(s.solution(A));

	}

}
