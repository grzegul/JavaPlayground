package rozdzial10;
import rozdzial10bis.*;

public class GreenhouseControlsFog extends GreenhouseControls {
	private boolean fog = false;
	public class FogOn extends Event {
		public FogOn(long delayTime) { super(delayTime); }
		public void action() {
			// Put hardware control code here to
			// physically turn on the light.
			fog = true;
		}
		public String toString() { return "Fog is on"; }
	}
	public class FogOff extends Event {
		public FogOff(long delayTime) { super(delayTime); }
		public void action() {
			// Put hardware control code here to
			// physically turn off the fog.
			fog = false;
		}
		public String toString() { return "Fog is off"; }
	}
}