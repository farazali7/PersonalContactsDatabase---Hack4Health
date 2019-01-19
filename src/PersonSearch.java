import java.util.ArrayList;
import java.util.Scanner;

public class PersonSearch {
    private ArrayList<Person> people;
    private Scanner reader;

    public PersonSearch(Scanner reader) {
        this.reader = reader;
        people = new ArrayList<Person>();
    }

    public ArrayList<Person> getPeople() {
        return this.people;
    }



    public void start() {


        while(true) {
            System.out.print("Who are we searching for today?: ");
            String input = reader.nextLine();

            if (input.equals("quit")) {
                break;
            }

            for (Person someone : people) {
                if (someone.getName().equals(input)) {
                    System.out.println("Here is some information on " + input + ".");
                    people.get(people.indexOf(someone)).DisplayInformation();
                }

                else if (someone.getRole().equals(input)) {

                    System.out.println("Here is everyone who is a " + input + "\n");

                    for (Person person: people) {
                        if (person.getRole().equals(input)) {
                            person.DisplayInformation();
                        }
                    }
                }
            }
        }

    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public Person getPerson(String name) {
        for (Person person: people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }

        return null;
    }
}




