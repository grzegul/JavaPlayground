package rozdzial03;
// ba³agan. nie jestem pewien, jak zwykle, czy o to Eckelowi chodzi³o...

class Dogg{
	String name;
	String says;
}

public class Cw06Pies {
	public static void main(String[]args){
		Dogg spot = new Dogg();
		Dogg scrufy = new Dogg();
		Dogg kundel = new Dogg();
		
		spot.name = "Spot";
		spot.says = "Hau";
				
		scrufy.says = "Wrr";
		scrufy.name = "Scrufy";
		
		System.out.println(spot.name+" says: "+spot.says);
		System.out.println(scrufy.name+" says: "+scrufy.says);
		
		System.out.println("\n"+spot.equals(scrufy));
		System.out.println(spot.says.equals(scrufy.says));
		System.out.println(spot.says==scrufy.says);
		
		kundel=spot;
		
		System.out.println("\n"+spot.name + " " + spot.says);
		System.out.println(kundel.name + " " + kundel.says);
		System.out.println(scrufy.name + " " + scrufy.says);
		
		System.out.println("\n"+spot.equals(kundel));
		System.out.println(spot.name==kundel.name);
		
		System.out.println(scrufy.equals(kundel));
		System.out.println(scrufy.name==kundel.name);
		
		System.out.println(spot.equals(scrufy));
		System.out.println(spot.name==scrufy.name);
		
		System.out.println(spot.equals(scrufy));
		System.out.println(spot.says==scrufy.says);
	}
}
