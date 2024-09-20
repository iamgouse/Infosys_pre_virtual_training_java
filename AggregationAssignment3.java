/*Aggregation - Assignment 3

Problem Statement
Jasmine Girls Hostel wants you to create a small application for them to assign rooms to members. You need to implement the classes based on the class diagram and description given below.



Member

Member(int memberId, String name)

Initialize the memberId and name instance variables appropriately with the values passed to the constructor.
Implement the appropriate getter and setter methods.

 

Room

Room()

Generate the roomNo using the static variable roomCounter. The value of roomNo should start from 500 and should be incremented by 1 for the subsequent values. Initialize the roomNoCounter in static block.

Initialize the capacity instance variable to 4.

Implement the appropriate getter and setter methods. 

 

Admin 

assignRoom(Room[] rooms, Member member)

Assign a room to the member using the below conditions:

One room can accommodate 4 members. 

Allocate the first room that is empty.

Once a room is fully occupied, only then a new room should be assigned.

Update the capacity of the allocated room accordingly.

Test the functionalities using the provided Tester class.*/


class Room {
	private int roomNo;
	private int capacity;
	private static int roomCounter;
	static {
		roomCounter =500;
	}
	Room(){
	  this.roomNo = Room.roomCounter;
	  Room.roomCounter++;
	  this.capacity= 4;
	}
    //Implement your code here 
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public static int getRoomCounter() {
		return roomCounter;
	}
	public static void setRoomCounter(int roomCounter) {
		Room.roomCounter = roomCounter;
	}
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
    public String toString(){
        return "Room\nroomNo: "+this.roomNo+"\ncapacity: "+this.capacity;
    }
    
}

class Member {
	private int memberId;
	private String name;
	private Room room;
	
	Member(int memberId, String name){
		this.memberId = memberId;
		this.name = name;
	}
	//Implement your code here 

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	//Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
   
    public String toString(){
        return "Member\nmemberId: "+this.memberId+"\nname: "+this.name;
    }
    
}

class Admin {
	//Implement your code here 
	public void assignRoom(Room[] rooms, Member member) {
		for(int i = 0; i<rooms.length; i++) {
			if(rooms[i].getCapacity()>0 && member!= null) {
				rooms[i].setCapacity(rooms[i].getCapacity()-1);
				member.setRoom(rooms[i]);
				return;
			}
		}
	}
}


class Tester {
	public static void main(String args[]) {
		Room room1 = new Room();
		Room room2 = new Room();
		Room room3 = new Room();
		Room room4 = new Room();
		Room room5 = new Room();

		Room[] totalRooms = { room1, room2, room3, room4, room5 };

		Admin admin = new Admin();

		Member member1 = new Member(101, "Serena");
		Member member2 = new Member(102, "Martha");
		Member member3 = new Member(103, "Nia");
		Member member4 = new Member(104, "Maria");
		Member member5 = new Member(105, "Eva");
		
		Member[] members = { member1, member2, member3, member4, member5 };
		
		for (Member member : members) {
			admin.assignRoom(totalRooms, member);
			if(member.getRoom()!=null) {
				System.out.println("Hi "+member.getName()+"! Your room number is "+member.getRoom().getRoomNo());
			}
			else {
				System.out.println("Hi "+member.getName()+"! No room available");
			}
		}
	}
} 
 



 
