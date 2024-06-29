public class Main {
        public static void main(String[] args) {
            // Create two Room objects
            Room room1 = new Room();
            Room room2 = new Room();
            Room.RoomCount roomc=new Room.RoomCount();
            room1.room();
          //  room2.room();
            roomc.room();

            // Access the static variable using the class name
            System.out.println("Total rooms created: " + Room.totalRooms); // Output: 2
        }
    }


