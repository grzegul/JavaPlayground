package lesson1;

public class Solution {
	
	public int solution(int N){
		int binGap = 0;
		
		String binary = Integer.toBinaryString(N);
		System.out.println("binary: " + binary);
		
		int [] tab = new int[binary.length()];
		int sumPrev = 0;
		int cnt = 0;
		for (int i=1; i<tab.length; i++){
			tab[i-1] = Integer.parseInt(binary.split("")[i-1]);
			tab[i] = Integer.parseInt(binary.split("")[i]);
			sumPrev += tab[i-1];
			if (tab[i]==0 & sumPrev > 0){
				cnt +=1;
			}
			else if (tab[i]==1 & cnt > 0){
				if (cnt > binGap){
					binGap = cnt;
					cnt = 0;
					sumPrev = 0;
				}
				else {
					cnt = 0;
					sumPrev = 0;
				}
				
			}
			
			System.out.println(sumPrev + "    " + cnt);
			
		}
		
		
		return binGap;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println("binGap = " + sol.solution(74901729));
	}

}
