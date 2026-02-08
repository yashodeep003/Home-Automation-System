package MODEL;

public class Light extends Device{
	int brightness;
	
	

	public int getBrightness() {
		return brightness;
	}

	void setBrightness(int brightness) {
		this.brightness = brightness;
	}


	//ParameterConstructer
	public Light(int brightness, String name, boolean isOn) {
		super(brightness, name, isOn, brightness);
		this.brightness = brightness;
	}
	
	
	void SETBrightness(int b) {
		brightness = b;
	}
}
//Class Light ENd here
