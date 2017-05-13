package rozdzial09;
//ciekawe rzeczy siê dziej¹ przez to, ¿e w dwóch podklasach zosta³y poniête niektóre metody

interface Playable{
	void play(Note n);
}

abstract class Instrument implements Playable{
	//abstract void play(Note n);
	abstract public String toString();
	abstract void adjust();
}
class Wind extends Instrument implements Playable{
	public void play(Note n){
		System.out.println("Wind.play() " + n);
	}
	@Override
	public String toString(){
		return "Wind";
	}
	void adjust(){
		System.out.println("Strojenie obiektu Wind");
	}
}
class Percussion extends Instrument implements Playable{
	public void play(Note n){
		System.out.println("Percussion.play() " + n);
	}
	@Override
	public String toString(){
		return "Percussion";
	}
	void adjust(){
		System.out.println("Strojenie obiektu Percussion");
	}
}
class Stringed extends Instrument implements Playable{
	public void play(Note n){
		System.out.println("Stringed.play() " + n);
	}
	@Override
	public String toString(){
		return "Stringed";
	}
	void adjust(){
		System.out.println("Strojenie obiektu Stringed");
	}
}
class Brass extends Wind{
	public void play(Note n){
		System.out.println("Brass.play() " + n);
	}
	void adjust(){
		System.out.println("Strojenie obiektu Brass");
	}
}
class Woodwind extends Wind{
	public void play(Note n){
		System.out.println("Woodwind.play() " + n);
	}
	@Override
	public String toString(){
		return "Woodwind";
	}
}
class Guitar extends Instrument{
	public void play(Note n){
		System.out.println("Guitar.play() " + n);
	}
	@Override
	public String toString(){
		return "Guitar";
	}
	void adjust(){
		System.out.println("Strojenie obiektu Guitar");
	}
}

public class Cw10 {
	public static void tune(Playable i){
		i.play(Note.MIDDLE_C);
		//i.adjust();	//interface Playable ni posiada tej metody
	}
	public static void tuneAll(Instrument[] e){
		for (Instrument i: e){
			tune(i);
		}
	}
	public static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
	public static void main (String[] args){
		Instrument[] orchestra = new Instrument[6];
		for(int i=0; i<orchestra.length; i++)
			orchestra[i] = gen.next();
		//Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(), new Guitar()};
		tuneAll(orchestra);
		for(int j=0; j<orchestra.length; j++){
			System.out.println(orchestra[j]);
		}
	}
}
