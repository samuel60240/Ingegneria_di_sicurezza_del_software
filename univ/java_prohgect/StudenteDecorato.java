public abstract class StudenteDecorator implements Studente {
    protected Studente studenteWrappato;

    public StudenteDecorator(Studente s) {
        this.studenteWrappato = s;
    }

    @Override
    public void seguiInsegnamento(String insegnamento) {
        studenteWrappato.seguiInsegnamento(insegnamento);
    }

    @Override
    public void sostieniEsame(String esame) {
        studenteWrappato.sostieniEsame(esame);
    }
}