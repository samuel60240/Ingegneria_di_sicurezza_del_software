public class StudenteTutor extends StudenteDecorator {
    public StudenteTutor(Studente s) {
        super(s);
    }

    public void faiRicevimento() {
        System.out.println("[TUTOR] Ricevimento studenti in corso...");
    }

    public void faiEsercitazioni() {
        System.out.println("[TUTOR] Svolgimento esercitazione...");
    }
}