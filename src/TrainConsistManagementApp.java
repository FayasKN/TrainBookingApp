import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie Type: " + name + " | Capacity: " + capacity + " seats";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<Bogie> passengerBogies = new ArrayList<>();

        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 78));
        passengerBogies.add(new Bogie("First Class", 24));

        System.out.println("--- Before Sorting ---");
        for (Bogie bogie : passengerBogies) {
            System.out.println(bogie);
        }

        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\n--- After Sorting by Capacity (Ascending) ---");
        for (Bogie bogie : passengerBogies) {
            System.out.println(bogie);
        }
    }
}