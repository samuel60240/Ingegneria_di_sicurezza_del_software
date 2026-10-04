public class TapeProva implements Supporto{
    
    private static TapeProva istanza = null;
    private String traccia;
    
  public static TapeProva getIstance(){
        if (istanza==null) {
            istanza = new TapeProva();
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
        return getClass().getSimpleName()+"\n";
    }
}
