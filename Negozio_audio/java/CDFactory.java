public class CDFactory implements HiFiFactory {
   @Override
    public Supporto creaSupporto() {
        return new CD();
    }
}