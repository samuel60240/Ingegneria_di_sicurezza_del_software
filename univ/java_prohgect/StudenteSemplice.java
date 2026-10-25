import java.util.*;

public class StudenteSemplice implements Studente{
    private HashMap<String,Integer> libretto;
    private HashSet<String> iscrizioni;

    public Studente(){
        libretto = new HashMap<>();
        iscrizioni = new hashSet<>();
    }

    public void iscrizioneAlleLezioni(String a){
        libretto.put(a,0);
    }
    public void sostieniEsame (String a) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il voto:");
        //scelta molto discutibile
        libretto.put(a,in.nextInt());
        iscrizioni.remove(a)
    }
}