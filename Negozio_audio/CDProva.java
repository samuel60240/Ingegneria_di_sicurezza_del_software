public class CDProva implements Supporto{

    private static CDProva istanza = null;
    private String traccia;

    public static CDProva getIstance(){
        if (istanza==null) {
            istanza = new CDProva();
        }

        return istanza;
    }

  

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
        return getClass().getSimpleName() + "\n";
    }
   
}