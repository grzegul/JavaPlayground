package lesson3;

public class PrefixSum {

	public int countTotal(int[]A, int x, int y){
		int[]P = new int [A.length+1];
		P[0] = 0;
		for(int i=1; i<P.length; i++){
			P[i] = P[i-1] + A[i-1];	
		}
		return P[y+1]-P[x];
	}
	
	public static void main(String[] args) {
		PrefixSum s = new PrefixSum();
		int[]A = {18,11,6,-2,12,-19,-4,-16,8,-17};
		System.out.println(s.countTotal(A,2,5));
	}

}
