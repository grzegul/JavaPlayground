package rozdzial10;
import rozdzial10bis.*;

public class GreenhouseController {
	public static void main(String[] args) {
		GreenhouseControls gc = new GreenhouseControls();
		// Instead of hard-wiring, you could parse
		// configuration information from a text file here:
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
			gc.new ThermostatNight(0),
			gc.new LightOn(200),
			gc.new LightOff(400),
			gc.new WaterOn(600),
			gc.new FanOn(700),
			gc.new WaterOff(800),
			gc.new FanOff(950),
			gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if(args.length == 1){
			gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
		}
		gc.run();
	}
}

// w Run configurations wpisaæ cokolwiek w zak³adce Arguments.
//program siê zatrzyma po jednym wykonaniu