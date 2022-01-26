package com.company;

class Participant1 {
    private static int counter;
    private String registrationId;
    private String name;
    private long contactNumber;
    private String city;
    static{
        counter=10000;
    }
    public Participant1(String name,long contactNumber,String city){
        this.name=name;
        this.contactNumber=contactNumber;
        this.city=city;
        this.registrationId="D" + ++counter;

    }
    public static int getCounter(){
        return counter;
    }
    public static void setCounter(int counter1){
        counter=counter1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegistrationId() {
        return registrationId;
    }
}
public class Participant {

    public static void main(String[] args) {

        Participant1 participant1 = new Participant1("Franklin", 7656784323L, "Texas");
        Participant1 participant2 = new Participant1("Merina", 7890423112L, "New York");

        //Create more objects and add them to the participants array for testing your code

        Participant1[] participants = { participant1, participant2 };

        for (Participant1 participant : participants) {
            System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
        }

    }
}
