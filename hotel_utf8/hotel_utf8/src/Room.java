import java.util.Scanner;

//싱글룸 
public class Room {
	Scanner scanner = new Scanner(System.in);
	public int roomNumber;
	public String roomStatus;
	// public static Room[] roomList;
	public int price;
	public String numBed;

	public Room(int roomNumber, String roomStatus) {
		this.roomNumber = roomNumber;
		this.roomStatus = roomStatus;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getNumBed() {
		return numBed;
	}

	public void setNumBed(String numBed) {
		this.numBed = numBed;
	}

	public Room() {

	}

	public void setprice() {
		for (int i = 0; i < RoomManager.roomList.length; i++) {
			int key = RoomManager.roomList[i].roomNumber % 2;
			switch (key) {
			case 1:
				// 싱글룸
				RoomManager.roomList[i].price = 70000;
				RoomManager.roomList[i].numBed = "싱글";
				break;

			case 0:
				// 더블룸
				RoomManager.roomList[i].price = 110000;
				RoomManager.roomList[i].numBed = "더블";
				break;
			}

		}
	}

}