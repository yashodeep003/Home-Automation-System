package MODEL;

public class Television extends Device{
	int volume;

	
	 public Television(int deviceId, String name, boolean isOn, long lastStateChangeTime, int volume) {
		super(deviceId, name, isOn, lastStateChangeTime);
		this.volume=volume;
	}
	
	 void setVolume(int v) {
		 volume=v;
	 }
}
