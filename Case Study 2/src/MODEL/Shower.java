package MODEL;


public class Shower extends Device{
	int waterFlow;


	public Shower(int deviceId, String name, boolean isOn, long lastStateChangeTime, int waterFlow) {
		super(deviceId, name, isOn, lastStateChangeTime);
		this.waterFlow=waterFlow;
	
	}
	
	
	void setWaterFlow(int w) {
		waterFlow=w;
	}	
}
//class Shower End here
