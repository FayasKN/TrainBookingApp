import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        System.out.println("Attempting to add duplicate ID 'BG101'...");
        boolean isDuplicateAdded = bogieIds.add("BG101");

        System.out.println("Was the duplicate added? " + isDuplicateAdded);

        System.out.println("Final Unique Bogie IDs: " + bogieIds);
    }
}