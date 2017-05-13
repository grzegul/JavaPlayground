package lesson3;

public class Copy_2_of_Solution01 {
	
	public int solution(int A, int B, int K) {
        int number = 0;
        int zmienna = 0;
        
        for (int i=A; i<(B+1); i++){
        	if (i%K==0){
        		zmienna = i;
        		break;
        	}else{
        		zmienna = i;
        	}
        }
        for (int j=zmienna; j<(B+1); j+=K){
        	if (j%K==0){
        		number += 1;
        	}
        	System.out.println("number = " + number);
        }
        
		return number;
    }
	
	public static void main(String[] args) {
		Copy_2_of_Solution01 s = new Copy_2_of_Solution01();
		int A = 11;
		int B = 345;
		int K = 17;
		System.out.println(s.solution(A, B, K));
	}

}

/*100%, 25%*/















/*Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Assume that:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.
Complexity:

expected worst-case time complexity is O(1);
expected worst-case space complexity is O(1).*/