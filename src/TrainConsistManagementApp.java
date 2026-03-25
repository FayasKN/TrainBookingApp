import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Initial passenger bogies: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("List after removing AC Chair: " + passengerBogies);

        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does the train have a Sleeper bogie? " + hasSleeper);

        System.out.println("Final state of passenger bogies: " + passengerBogies);
    }
}