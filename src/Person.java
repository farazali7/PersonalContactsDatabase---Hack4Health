import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Event> Events;
    private String phoneNumber;
    private String address;
    private String role;

    public Person(String name, String address, String role, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.role = role;
        Events = new ArrayList<Event>();
    }

    public Person(String name) {
        this(name, "", "", "");
    }


    public String getName() {
        return this.name;

    }

    public String getNumber() {
        return this.phoneNumber;
    }

    public String getRole() {
        return this.role;
    }

    public ArrayList<Event> getEvents() {
        return this.Events;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void DisplayInformation() {

        System.out.println("Name: " + name + "\n");
        System.out.println("Relationship: " + role + "\n");
        System.out.println("Phone Number: " + phoneNumber + "\n");
        System.out.println("Address: " + address + "\n");

        System.out.println("These are your past events with " + name + ":" + "\n");
        DisplayEvents();

    }

    public void DisplayEvents() {
        for(Event event: Events) {
            System.out.println("This is what you did with " + name + " on " + event.getDate() + " at " + event.getLocation() + ":");
            System.out.println(event.getStory());
            System.out.println();
        }

    }
    public void addEvent(String date, String location, String story) {
        Events.add(new Event(date, location, story));
    }

    public void addEvent(String date, String location) {
        Events.add(new Event(date, location));
    }



    // create a version of the tablet which will "age" with the patient
    // send diagnostic information back to the primary health caregiver









}
