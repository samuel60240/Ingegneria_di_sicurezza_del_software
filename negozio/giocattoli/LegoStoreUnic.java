
import java.util.HashMap;
import java.util.Scanner;

public  class LegoStoreUnic implements LegoToysInterface {

    private static LegoStoreUnic instance;
    LegoItem legoItem = new LegoItem();
    


    public static synchronized LegoStoreUnic getInstance() {
        if (instance == null) {
            instance = new LegoStoreUnic();
        }
        return instance;
    }

    @Override
    public HashMap<String, Integer> createLegoToys(Scanner scanner) {
        // Implementation for creating Lego toys
        System.out.println("Creating Lego toys...");
        System.out.println("Select the part you want to create:\n 1) Bricks\n2) Minifigures\n3) Accessories");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Creating Lego Bricks...");
                legoItem.legoToysInventory.put("Lego Bricks", legoItem.legoToysInventory.getOrDefault("Lego Bricks", 0) + 1);
                return legoItem.legoToysInventory;
                
            case 2:
                System.out.println("Creating Lego Minifigures...");
                legoItem.legoToysInventory.put("Lego Minifigures", legoItem.legoToysInventory.getOrDefault("Lego Minifigures", 0) + 1);
                return legoItem.legoToysInventory;
                
            case 3:
                System.out.println("Creating Lego Accessories...");
                legoItem.legoToysInventory.put("Lego Accessories", legoItem.legoToysInventory.getOrDefault("Lego Accessories", 0) + 1);
                return legoItem.legoToysInventory;
                
            default:
                System.out.println("Invalid choice. Please try again.");
                return legoItem.legoToysInventory;
                
            }
    }
    @Override
    public LegoItem duplicateLegoToys(LegoItem toy) {
        LegoItem copy = new LegoItem();
        copy.legoToysInventory = new HashMap<>(toy.getLegoToysInventory());
        return copy;
    }
    public HashMap<String, Integer> getLegoToysInventory() {
        return legoItem.getLegoToysInventory();
    }
}
