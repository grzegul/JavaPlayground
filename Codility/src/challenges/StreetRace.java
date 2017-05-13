package challenges;

import java.util.*;

class Solution {
	public int solution(int[] A, int[] B, int K){
		if (A.length != B.length){
			System.out.println("!!!");
			System.exit(0);
		}
		
		//lista pocz¹tków i lista skrzy¿owañ z iloœciami dochodz¹cych dróg
		ArrayList<Integer> poczatki = new ArrayList<Integer>();
		Map<Integer, Integer> intersect = new HashMap<Integer, Integer>();
		for (int j=0; j<A.length; j++){
			int countA = 0;
			int countB = 0;
			for(int i=0; i<A.length;i++){
				if(A[j]==A[i] | A[j]==B[i]){
					countA += 1;
				}
				if(B[j]==B[i] | B[j]==A[i]){
					countB += 1;
				}	
			}
			if (countA == 1){
				poczatki.add(A[j]);
			}else{
				intersect.put(A[j], countA);
			}
			if (countB == 1){
				poczatki.add(B[j]);
			}else{
				intersect.put(B[j], countB);
			}
		}
		System.out.println(poczatki);
		System.out.println(intersect.entrySet());
		
		System.out.println(intersect.keySet());
		System.out.println(intersect.values());
		
		
		for(int x=0; x<poczatki.size()-1;x++){	//poczatki
			int pocz = poczatki.get(x);
			System.out.println("xxx " + Arrays.asList(A).indexOf(pocz));
			
			
			for(int z=x+1; z<poczatki.size();z++){	//koñce
				int kon = poczatki.get(z);
				System.out.println("pocz " + pocz + ", kon " + kon);
				
				
				
				
				
				/*
				int w = -1;
				
				while(w!=poczatki.get(z)){
					
					for(int y=0; y<A.length; y++){
						int cnt = 0;
						if(A[y]==poczatki.get(x)){
							//System.out.println(B[y]);
							w = B[y];
							cnt +=1;
							System.out.println(w);
						}
					}
				}*/
			}
			
			
			
			
		}
		
		
		
		
		int p = K;	

		return p;
	}
	
}

public class StreetRace {
	public static void main (String[] args){
		int[] A = {5,1,0,2,7,0,6,6,1};
		int[] B = {1,0,7,4,2,6,8,3,9};
		int K = 2;
		Solution s = new Solution();
		s.solution(A,  B,  K);
		//System.out.println(s.solution(A,  B,  K));
	}
}
