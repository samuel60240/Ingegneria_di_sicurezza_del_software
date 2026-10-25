
import java.util.HashMap;
import java.util.Scanner;

interface LegoToysInterface  {
    public HashMap<String, Integer> createLegoToys(Scanner scanner);
    public LegoItem duplicateLegoToys(LegoItem toy);//prototype
}