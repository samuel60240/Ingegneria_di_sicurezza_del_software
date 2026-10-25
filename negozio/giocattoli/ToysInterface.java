
import java.util.Scanner;

public interface ToysInterface {
    public void createToys(Scanner scanner);
    public ToysInterface duplicateToys(ToysInterface toy);//prototype
    public void destroyToys(ToysInterface toy);
}