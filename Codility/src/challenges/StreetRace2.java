package challenges;

import java.util.*;

class Solution2 {
	public int solution(int[] A, int[] B, int K){
		if (A.length != B.length){
			System.out.println("!!!");
			System.exit(0);
		}
		
		//lista pocz¹tków i lista skrzy¿owañ z iloœciami dochodz¹cych dróg
				ArrayList<Integer> poczatki = new ArrayList<Integer>();
				Map<Integer, Integer> intersect = new HashMap<Integer, Integer>();
				for (int i=0; i<A.length; i++){
					int countA = 0;
					int countB = 0;
					for(int j=0; j<A.length;j++){
						if(A[i]==A[j] | A[i]==B[j]){
							countA += 1;
						}
						if(B[i]==B[j] | B[i]==A[j]){
							countB += 1;
						}	
					}
					intersect.put(A[i], countA);
					intersect.put(B[i], countB);
				}
				System.out.println(intersect.entrySet());
				
				System.out.println(intersect.keySet());
				
				int count = 0;
				for(int i=0; i<A.length; i++){
					int prev = B[i];
					for(int j=0; j<A.length; j++){
						while(A[j]==B[i])
						
						
						if(A[j]==B[i]){
							count += 1;
							System.out.println(A[j] + " " + B[j] + " " + count);
						}
					}
				}

		
				
				
				
		int p = K;	

		return p;
	}
	
}

public class StreetRace2 {
	public static void main (String[] args){
		int[] A = {5,1,0,2,7,0,6,6,1};
		int[] B = {1,0,7,4,2,6,8,3,9};
		int K = 2;
		Solution2 s = new Solution2();
		s.solution(A,  B,  K);
		//System.out.println(s.solution(A,  B,  K));
	}
}
