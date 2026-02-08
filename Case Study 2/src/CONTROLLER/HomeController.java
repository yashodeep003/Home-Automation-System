package CONTROLLER;

import java.util.Random;
import java.util.Scanner;

import MODEL.Device;
import MODEL.HomeAutomation;
import MODEL.Room;
import MODEL.Light;
import MODEL.AirConditioner;
import MODEL.Television;
import MODEL.Shower;
import MODEL.Microwave;
import VIEW.HomeView;

public class HomeController {

	private HomeAutomation model;
	private HomeView view;
	private Scanner sc;

	public HomeController() {
		model = new HomeAutomation();
		view = new HomeView();
		sc = new Scanner(System.in);
	}

	public void start() {
		while (true) {

			view.showMenu();
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				addRoom();
				break;

			case 2:
				addDevice();
				break;

			case 3:
				turnOnDevice();
				break;

			case 4:
				turnOffDevice();
				break;

			case 5:
				view.showStatus(model.getStatus());
				break;

			case 6:
				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	private void addRoom() {
		System.out.print("Enter room name: ");
		String room = sc.nextLine();
		model.addRooms(new Room(room));
		System.out.println("Room added!");
	}

	private void addDevice() {

		view.showRooms(model.getRooms());
		System.out.print("Enter room name: ");
		String room = sc.nextLine();

		System.out.println("Choose Device Type:");
		System.out.println("1. Light");
		System.out.println("2. Air Conditioner");
		System.out.println("3. Television");
		System.out.println("4. Shower");
		System.out.println("5. Microwave");

		int type = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter device name: ");
		String name = sc.nextLine();

		int id = new Random().nextInt(10000);

		Device d = null;

		switch (type) {
		case 1:
			d = new Light(id, name, false);
			break;

		case 2:
			d = new AirConditioner(id, name, false, id, id);
			break;

		case 3:
			d = new Television(id, name, false, id, id);
			break;

		case 4:
			d = new Shower(id, name, false, id, id);
			break;

		case 5:
			d = new Microwave(id, name, false, id, id);
			break;

		default:
			d = null;
		}

		if (d != null) {
			model.addDevice(room, d);
			System.out.println("Device added!");
		} else {
			System.out.println("Invalid device type!");
		}
	}

	private void turnOnDevice() {

		view.showRooms(model.getRooms());
		System.out.print("Enter room: ");
		String room = sc.nextLine();

		for (Room r : model.getRooms())
			if (r.getRoomName().equalsIgnoreCase(room))
				view.showDevices(r.getDevices());

		System.out.print("Enter device name: ");
		String device = sc.nextLine();

		model.turnOnDevice(room, device);
		System.out.println("Device turned ON!");
	}

	private void turnOffDevice() {

		view.showRooms(model.getRooms());
		System.out.print("Enter room: ");
		String room = sc.nextLine();

		for (Room r : model.getRooms())
			if (r.getRoomName().equalsIgnoreCase(room))
				view.showDevices(r.getDevices());

		System.out.print("Enter device name: ");
		String device = sc.nextLine();

		model.turnOffDevice(room, device);
		System.out.println("Device turned OFF!");
	}
}
