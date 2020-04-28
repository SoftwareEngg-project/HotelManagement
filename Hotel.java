package hotel.management;

public class Hotel extends Room {

    private int roomsNumber = 30;
    private int extraBeds = 15;
    private int roomsPremium = 3;
    
    public Hotel(){
    
    Room();
    roomsNumber = 30;
    extraBeds = 14;
    roomsPremium = 3;
}

    public int getFreeRooms(){
        return roomsNumber;
    }
    
    public int getNrofExtraBeds(){
        return extraBeds;
    }
    
    public int getFreePremium(){
        return roomsPremium;
    }
    
    public void buyRoom() {
        if (roomsNumber == 0) {
            System.out.println("Fully Booked");
        } else {
            roomsNumber--;
        }
    }

    public void child() {
        if (extraBeds == 0) {
            System.out.println("No extra beds left");
        } else {
            extraBeds--;
            addBed();
        }
    }

    public void upgrade() {
        if (roomsPremium == 0) {
            System.out.println("No Premium Rooms Left");
        } else {
            roomsPremium--;
            upgradeRoom();
        }
    }
}

