import java.util.Scanner;

public class Cliente{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MecaToysCostructor mecaToysConstructor = new MecaToysCostructor();
        mecaToysConstructor.createToys(scanner);
        
    }
}