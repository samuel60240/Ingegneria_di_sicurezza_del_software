import java.util.HashMap;
import java.util.Scanner;

public interface RobotsInterface {
    public void move();
    public void addArm(HashMap<String, Integer> robotTechnology, Scanner scanner);
    public void addLeg(HashMap<String, Integer> robotTechnology, Scanner scanner);
    public void addHead(HashMap<String, Integer> robotTechnology, Scanner scanner);
    public void addTorso(HashMap<String, Integer> robotTechnology, Scanner scanner);
    public void addWheels(HashMap<String, Integer> robotTechnology, Scanner scanner);
    public void addWeapons(HashMap<String, Integer> robotTechnology, Scanner scanner);
}