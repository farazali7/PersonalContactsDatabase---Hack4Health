public class Event {
    private String date;
    private String location;
    private String story;

    public Event(String date, String location, String story){
        this.date = date;
        this.location = location;
        this.story = story;
    }

    public Event(String date, String location){
        this(date, location, "");
    }

    public String getDate() {
        return this.date;
    }

    public String getLocation() {
        return this.location;
    }

    public String getStory() {
        return this.story;
    }

    public void addStory(String details) {
        this.story = details;
    }
}
