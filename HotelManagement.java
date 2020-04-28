package hotel.management;

import java.util.Scanner;

public class HotelManagement {

    public static void main(String[] args) {
        Hotel Sept = new Hotel();
        Scanner myObj = new Scanner(System.in);
        String option = "1";

        while (option != "0") {
            System.out.println("-----------------------------------------------");
            System.out.println("Welcome to Hotel Manegement");
            System.out.println("1. Buy Room");
            System.out.println("2. See available rooms");
            System.out.println("3. See numer of extra beds available");
            System.out.println("4. Buy Premium Room");
            System.out.println("Enter 0 to exit");

            option = myObj.nextLine();

            switch (option) {
                case "1":
                    Sept.buyRoom();
                    System.out.println("Total " + Sept.getPrice());
                    break;
                case "2":
                    System.out.println("Camere " + Sept.getFreeRooms());
                    break;
                case "3":
                    System.out.println("Paruti " + Sept.getNrofExtraBeds());
                    break;
                case "4":
                    Sept.buyRoom();
                    Sept.upgrade();
                    System.out.println("Total " + Sept.getPrice());
                    break;
            }
        }
    }
}
