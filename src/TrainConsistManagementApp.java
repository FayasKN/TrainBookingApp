import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Initial Train Formation: " + trainFormation);

        System.out.println("Attempting to attach duplicate bogie 'Sleeper'...");
        boolean isDuplicateAdded = trainFormation.add("Sleeper");

        System.out.println("Was the duplicate attached? " + isDuplicateAdded);
        System.out.println("Final Train Formation: " + trainFormation);
    }
}