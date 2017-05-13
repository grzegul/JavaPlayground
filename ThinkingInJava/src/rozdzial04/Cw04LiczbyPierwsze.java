package rozdzial04;

// podaje liczby pierwsze za pomoc¹ % i zagnie¿d¿onej pêtli for

public class Cw04LiczbyPierwsze {
	public static void main(String[]args){
		System.out.print("1, ");
		for (int i=0; i<100; i++){
			for (int a=2; a<=i; a++){
				if ((i%a==0)&&((i/a)>1)){
					break;
				}
				else if((i%a==0)&&(i/a)==1){
					System.out.print(i + ", ");
				}
			}
		}
	}
}
