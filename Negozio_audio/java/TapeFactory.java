public class TapeFactory implements HiFiFactory {
    @Override
    public Supporto creaSupporto() {
        return new Tape();
    }
}
