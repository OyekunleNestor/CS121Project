package weekFour;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFloors;
        int totalRooms = 0;
        int totalOccupied = 0;
        System.out.print("Enter the number of floors in the hotel: ");
        numberOfFloors = scanner.nextInt();
        for (int floor = 1; floor <= numberOfFloors; floor++) {
            System.out.print("Enter the number of rooms on floor " + floor + ": ");
            int roomsOnFloor = scanner.nextInt();
            System.out.print("Enter the number of occupied rooms on floor " + floor + ": ");
            int occupiedRooms = scanner.nextInt();
            int vacantRooms = roomsOnFloor - occupiedRooms;
            totalRooms += roomsOnFloor;
            totalOccupied += occupiedRooms;
            System.out.println("Floor " + floor + ":");
            System.out.println("   Total Rooms: " + roomsOnFloor);
            System.out.println("   Occupied Rooms: " + occupiedRooms);
            System.out.println("   Vacant Rooms: " + vacantRooms);
        }
        double occupancyRate = (double) totalOccupied / totalRooms * 100;
        System.out.println("\nHotel Occupancy Summary:");
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Total Rooms: " + totalRooms);
        System.out.println("Total Occupied Rooms: " + totalOccupied);
        System.out.println("Total Vacant Rooms: " + (totalRooms - totalOccupied));
        System.out.println("Occupancy Rate: " + occupancyRate + "%");
        scanner.close();
    }
}

