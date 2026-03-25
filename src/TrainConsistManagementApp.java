import java.util.ArrayList;
import java.util.List;

class Bogie {
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<Bogie> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());
    }
}