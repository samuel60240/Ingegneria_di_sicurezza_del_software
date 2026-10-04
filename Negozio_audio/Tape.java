public class Tape implements Supporto{

    private String traccia;

    @Override
    public void registrazione(String traccia) {
        this.traccia = traccia;
    }

    @Override
    public void riproduzione() {
        System.out.println("Riproduzione traccia: " + traccia);
    }

    @Override
    public String getTipo() {
        return getClass().getSimpleName()+"\n";
    }
}