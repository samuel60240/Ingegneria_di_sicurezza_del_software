import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudenteDimostratore extends StudenteDecorator {
    private List<String> eventi;

    public StudenteDimostratore(Studente s) {
        super(s);
        this.eventi = new ArrayList<>();
    }

    public void aggiungiEvento(String evento) {
        eventi.add(evento);
        System.out.println("[DIMOSTRATORE] Tracciato evento: " + evento);
    }

    public Iterator<String> creaIteratore() {
        return eventi.iterator();
    }
}