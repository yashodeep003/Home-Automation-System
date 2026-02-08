package MODEL;

import java.util.ArrayList;

public class HomeAutomation {
	

	HomeDAO dao=new HomeDAO();
	
	// Constructor
	public HomeAutomation() {
		this.dao = dao;
	}


	// Add a room to the home
	public void addRooms(Room R) {
		
		dao.addRoom(R);
	}


	// Returns the list of all rooms to the Controller or View
	//displaying rooms and device listing
	public ArrayList<Room> getRooms() {
		return dao.getAllRooms();
	}
	

	// Adds a device inside a specific room
	public void addDevice(String RoomName, Device d) {
		for (Room r : dao.getAllRooms()) {
			if (r.getRoomName().equalsIgnoreCase(RoomName)) {
				r.addDevice(d); // Add device to this room
			}
		}
	}
	
	
	// Turn ON a device inside a specific room
	public void turnOnDevice(String roomName, String deviceName) {
		for (Room r : dao.getAllRooms())
			if (r.getRoomName().equalsIgnoreCase(roomName))
				for (Device d : r.getDevices())
					if (d.getName().equalsIgnoreCase(deviceName))
						d.turnOn();
	}
	
	// Turn OFF a device inside a specific room
	public void turnOffDevice(String roomName, String deviceName) {
		for (Room r : dao.getAllRooms())
			if (r.getRoomName().equalsIgnoreCase(roomName))
				for (Device d : r.getDevices())
					if (d.getName().equalsIgnoreCase(deviceName))
						d.turnOff();
	}
	

	// Returns the full status of the home
	public String getStatus() {
		StringBuilder sb = new StringBuilder("\n--- HOME STATUS ---\n");
		
		for (Room r : dao.getAllRooms())
			sb.append(r.getRoomStatus()).append("\n");
		
		return sb.toString();
	}

}
