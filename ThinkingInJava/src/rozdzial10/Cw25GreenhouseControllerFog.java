package rozdzial10;
import rozdzial10bis.*;

public class Cw25GreenhouseControllerFog extends GreenhouseController{
	public static void main(String[] args) {
		GreenhouseControlsFog gc = new GreenhouseControlsFog();
		// Instead of hard-wiring, you could parse
		// configuration information from a text file here:
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
			//gc.new ThermostatNight(0),
			gc.new FogOn(100),
			//gc.new LightOn(200),
			//gc.new LightOff(400),
			gc.new FogOff(500),
			/*gc.new WaterOn(600),
			gc.new FanOn(700),
			gc.new WaterOff(800),
			gc.new FanOff(950),
			gc.new ThermostatDay(1400)*/
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if(args.length == 1){
			gc.addEvent(new GreenhouseControlsFog.Terminate(new Integer(args[0])));
		}
		gc.run();
	}
}

// w Run configurations wpisaæ cokolwiek w zak³adce Arguments.
//program siê zatrzyma po jednym wykonaniu