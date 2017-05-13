package rozdzial08;
//ciekawe rzeczy siê dziej¹ przez to, ¿e w dwóch podklasach zosta³y poniête niektóre metody

class Instrument{
	void play(Note n){
		System.out.println("Instrument.play() " + n);
	}
	public String toString(){ //metoda what() zamieniona na toString(), ¿eby mo¿na by³o wydrukowaæ
		return "Instrument";
	}
	void adjust(){
		System.out.println("Strojenie obiektu Instrument");
	}
}
class Wind extends Instrument{
	void play(Note n){
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
class Percussion extends Instrument{
	void play(Note n){
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
class Stringed extends Instrument{
	void play(Note n){
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
	void play(Note n){
		System.out.println("Brass.play() " + n);
	}
	void adjust(){
		System.out.println("Strojenie obiektu Brass");
	}
}
class Woodwind extends Wind{
	void play(Note n){
		System.out.println("Woodwind.play() " + n);
	}
	@Override
	public String toString(){
		return "Woodwind";
	}
}
class Guitar extends Instrument{
	void play(Note n){
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

public class Cw060708 {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
		i.adjust();
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
