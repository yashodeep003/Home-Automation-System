package MODEL;

public class AirConditioner extends Device {
	
	int temperature;


	 public AirConditioner(int deviceId, String name, boolean isOn, long lastStateChangeTime, int temperature) {
		super(deviceId, name, isOn, lastStateChangeTime);

		this.temperature= temperature;
	}
	
	
	 void setTemperature(int t) {
		 temperature = t;
	 }
	 

}
//Class AirConditioner End Here
