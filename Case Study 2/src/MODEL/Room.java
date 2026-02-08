package MODEL;

import java.util.ArrayList;

public class Room {

	private String roomName;

	// List of devices inside this room
	private ArrayList<Device> devices;

	
	// Constructor
	public Room(String roomName) {
		this.roomName = roomName;
		this.devices = new ArrayList<Device>();
	}


	// Add a device into this room
	void addDevice(Device d) {
		devices.add(d);
	}


	// Returns all devices in this room
	// Used by View to display device lists
	public ArrayList<Device> getDevices() {
		return devices;
	}


	// Returns the room name
	public String getRoomName() {
		return roomName;
	}


	// Returns the complete status of the room
	String getRoomStatus() {

		// Start building room status text
		StringBuilder sb = new StringBuilder("Room: " + roomName + "\n");

		for (Device d : devices) {
			sb.append("  - ").append(d.getStatus()).append("\n");
		}

		return sb.toString();
	}
}
// Room End Here
