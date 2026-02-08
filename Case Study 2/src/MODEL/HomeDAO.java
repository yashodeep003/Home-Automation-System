package MODEL;


import java.util.ArrayList;
import MODEL.Room;

public class HomeDAO {

    // Acts like a database (in-memory)
    private ArrayList<Room> rooms;

    public HomeDAO() {
        rooms = new ArrayList<>();
    }

    // Save a room
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Fetch all rooms
    public ArrayList<Room> getAllRooms() {
        return rooms;
    }
}
