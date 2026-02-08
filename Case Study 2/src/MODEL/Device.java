package MODEL;

public class Device {
	int deviceId;
	String name;
	boolean isOn;
	long lastStateChangeTime;

	// Getter&Setter
	int getDeviceId() {
		return deviceId;
	}

	void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	boolean isOn() {
		return isOn;
	}

	void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	long getLastStateChangeTime() {
		return lastStateChangeTime;
	}

	void setLastStateChangeTime(long lastStateChangeTime) {
		this.lastStateChangeTime = lastStateChangeTime;
	}

	// ParameterConstructer
	Device(int deviceId, String name, boolean isOn, long lastStateChangeTime) {
		this.deviceId = deviceId;
		this.name = name;
		this.isOn = isOn;
		this.lastStateChangeTime = lastStateChangeTime;
	}

	void turnOn() {
		if (!isOn) {
			isOn = true;
			lastStateChangeTime = System.currentTimeMillis();
		}
	}

	void turnOff() {
		if (isOn) {
			isOn = false;
			lastStateChangeTime = System.currentTimeMillis();
		}
	}

	// On or off fun
	void toggle() {
		if (isOn) {
			turnOn();
		} else {
			turnOff();
		}
	}

	String getStatus() {
		return name + "( ID :" + deviceId + "is" + (isOn ? "ON" : "OFF") + "Time" + getTimeInCurrentState() + "Sec.";

	}

	long getTimeInCurrentState() {
		return (System.currentTimeMillis() - lastStateChangeTime) / 1000;
	}

}
//Device Class End Here
