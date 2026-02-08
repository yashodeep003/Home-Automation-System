package VIEW;

import java.util.ArrayList;

import MODEL.Device;
import MODEL.Room;

public class HomeView {

	
	public void showMenu(){
		System.out.println("\n===== HOME AUTOMATION MENU =====");
        System.out.println("1. Add Room");
        System.out.println("2. Add Device");
        System.out.println("3. Turn ON Device");
        System.out.println("4. Turn OFF Device");
        System.out.println("5. Show Home Status");
        System.out.println("6. Exit");
        System.out.println();
        System.out.print("Enter choice: ");

	}
	
	
	public void showRooms(ArrayList<Room> Rooms){
		System.out.println("\n---*** Rooms ***---");
		for(Room r :Rooms) {
			System.out.println("-" + r.getRoomName());
			
		}
	}
	
	public void showDevices(ArrayList<Device> devices){
		System.out.println("\n--- Devices ---");
		for(Device d: devices) {
			System.out.println("- " + d.getName());
		}
		
	}
	
	public void showStatus(String s){
        System.out.println(s);
	}
}
