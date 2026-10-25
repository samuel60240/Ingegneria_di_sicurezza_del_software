
import java.util.HashMap;
import java.util.Scanner;

public class MecaToysCostructor implements MecaToysInterface {
    
    @Override
    public void createToys(Scanner scanner) {
        System.out.println("Welcome to the mechanical toys store!\n"
                + "What kind of mechanical toys would you like to create?\n1) Robot\n2) Lego\n");

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Creating a robot toy...");
                RobotBuilder robot = new RobotBuilder(scanner);
                Robots robotToy = robot.getRobot();
                break;
            case 2:
                System.out.println("Creating a Lego toy...");
                LegoStoreUnic legoStore = LegoStoreUnic.getInstance();
                legoStore.createLegoToys(scanner);      
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    @Override
    public ToysInterface duplicateToys(ToysInterface toy) {
        if (toy instanceof Robots robot) {
            Robots newRobot = new Robots();
            newRobot.getRobotTechnology().putAll(robot.getRobotTechnology());
            return (ToysInterface) newRobot;
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void destroyToys(ToysInterface toy) {
        if (toy instanceof Robots) {
            ((Robots) toy).getRobotTechnology().clear();
        } else {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }




    private class RobotBuilder {
        private Robots robot;

        RobotBuilder(Scanner scanner) {
            this.robot = new Robots();
            addArm(scanner);
            addLeg(scanner);
            addHead(scanner);
            addTorso(scanner);
            addWheels(scanner);
            addWeapons(scanner);
        }

        
        public Robots getRobot() {
            return robot;
        }

        public void addArm(Scanner scanner) {
            robot.addArm(robot.getRobotTechnology(), scanner);
        }

        public void addLeg(Scanner scanner) {
            robot.addLeg(robot.getRobotTechnology(), scanner);
        }

        public void addHead(Scanner scanner) {
            robot.addHead(robot.getRobotTechnology(), scanner);
            
        }

        public void addTorso(Scanner scanner) {
            robot.addTorso(robot.getRobotTechnology(), scanner);
            
        }

        public void addWheels(Scanner scanner) {
            robot.addWheels(robot.getRobotTechnology(), scanner);
            
        }

        public void addWeapons(Scanner scanner) {
            robot.addWeapons(robot.getRobotTechnology(), scanner);
            
        }


    }

    public HashMap<String, Integer> MecaToysLegoManager(Scanner scanner) {


        LegoStoreUnic legoStore = LegoStoreUnic.getInstance();
        legoStore.createLegoToys(scanner);
        return legoStore.getLegoToysInventory();
    }
}