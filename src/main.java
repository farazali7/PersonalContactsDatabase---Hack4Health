import java.util.Scanner;
import java.io.File;

public class main {

    public static void main(String [] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        //File file1 = new File("src/momSearch.txt");
        //Scanner fileReader = new Scanner(file1);
        PersonSearch searcher = new PersonSearch(reader);





        searcher.addPerson(new Person("Mary", "3403 fortress drive", "mother", "905-990-3424"));
        searcher.getPerson("Mary").addEvent("July 10, 2018", "Kariya Park", "Went to lunch with mother on a sunny day.");
        searcher.getPerson("Mary").addEvent("August 3, 2018", "Central Convenience Store", "Went to the supermarket for shopping.");

        searcher.addPerson(new Person("Teresa", "4489 latimer road", "daughter", "905-869-1127"));
        searcher.getPerson("Teresa").addEvent("May 5 2018", "Games Room", "Played board games for a few hours.");

        searcher.addPerson(new Person("Bethany", "3403 fortress drive", "daughter", "416-555-2740"));
        searcher.getPerson("Bethany").addEvent("May 12 2018", "Johnson Estate", "Played frisbee outside.");


        searcher.addPerson(new Person("James", "899 kayak drive", "tennis club friend", "647-212-2190"));
        searcher.getPerson("James").addEvent("September 09 2018", "Lee's Club", "Practiced tennis skills.");

        while (fileReader.hasNext()) {
            String word = reader.next();
            for (Person person:searcher.getPeople()) {
                if (person.getName().equals(word) || person.getRole().equals(word)) {
                    break;
                }
            }

        }


        searcher.start();
    }
}
