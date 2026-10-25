
import java.util.HashMap;
import java.util.Scanner;

public class Robots implements RobotsInterface {
        private HashMap<String, Integer> robotTechnology = new HashMap<String, Integer>();


        @Override
        public void addArm(HashMap<String, Integer> robotTechnology, Scanner scanner) {
            HashMap<String, Integer> tech = (HashMap<String, Integer>) robotTechnology;
            System.out.println("Do you want to add arm? (yes/no)");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                System.out.println("How many arms do you want to add?");
                tech.put("arm", scanner.nextInt());
            }
        }

        @Override
        public void addLeg(HashMap<String, Integer> robotTechnology, Scanner scanner) {
            HashMap<String, Integer> tech = (HashMap<String, Integer>) robotTechnology;
            System.out.println("Do you want to add leg? (yes/no)");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                System.out.println("How many legs do you want to add?");
                tech.put("leg", scanner.nextInt());
            }
        }

        @Override
        public void addHead(HashMap<String, Integer> robotTechnology, Scanner scanner) {
            HashMap<String, Integer> tech = (HashMap<String, Integer>) robotTechnology;
            System.out.println("Do you want to add head? (yes/no)");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                System.out.println("How many heads do you want to add?");
                tech.put("head", scanner.nextInt());
            }
        }

        @Override
        public void addTorso(HashMap<String, Integer> robotTechnology, Scanner scanner) {
            HashMap<String, Integer> tech = (HashMap<String, Integer>) robotTechnology;
            System.out.println("Do you want to add torso? (yes/no)");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                System.out.println("How many torsos do you want to add?");
                tech.put("torso", scanner.nextInt());
            }
        }

        @Override
        public void addWheels(HashMap<String, Integer> robotTechnology, Scanner scanner) {
            HashMap<String, Integer> tech = (HashMap<String, Integer>) robotTechnology;
            System.out.println("Do you want to add wheels? (yes/no)");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                System.out.println("How many wheels do you want to add?");
                tech.put("wheels", scanner.nextInt());
            }
        }

        @Override
        public void addWeapons(HashMap<String, Integer> robotTechnology, Scanner scanner) {
            HashMap<String, Integer> tech = (HashMap<String, Integer>) robotTechnology;
            System.out.println("Do you want to add weapons? (yes/no)");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                System.out.println("How many weapons do you want to add?");
                tech.put("weapons", scanner.nextInt());
            }
        }

    @Override
    public void move() {
        System.out.println("The robot moves.");
    }

    public HashMap<String, Integer> getRobotTechnology() {
        return robotTechnology;
    }

    public Robots copy() {
        Robots copy = new Robots();
        copy.robotTechnology = new HashMap<>(this.robotTechnology);
        return copy;
    }

}