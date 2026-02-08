package MODEL;


public class Microwave extends Device{
	
	int temperature;

	
	 public Microwave(int deviceId, String name, boolean isOn, long lastStateChangeTime, int temperature) {
		super(deviceId, name, isOn, lastStateChangeTime);
		this.temperature=temperature;
	}
	
		void setTemperature(int t) {
			temperature=t;
		}

		
}