package com.company;

class Room {
    private int roomNo;
    private int capacity;
    private static int roomCounter;

    static {
        roomCounter=499;
    }
    public Room(){
        roomNo=++roomCounter;
        this.capacity=4;
    }

    public int getRoomNo() {
        return roomNo;
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
}

class  Member{
    private int memberId;
    private String name;
    private Room room;
    Member(int memberId, String name){
        this.memberId=memberId;
        this.name=name;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }






}
class Admin{
    public void assignRoom(Room[] room,Member member){

        for (Room r:room){
            if(r.getCapacity()<=4 && r.getCapacity()>0){
                member.setRoom(r);
                r.setCapacity(r.getCapacity()-1);
            }
        }


    }
}
