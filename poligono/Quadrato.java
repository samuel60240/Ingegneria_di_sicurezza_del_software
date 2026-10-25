public class Quadrato implements Poligono {
    private double lato;

    public Quadrato() {
        this(1);
    }

    public Quadrato(double lato) {
        this.lato = lato;
    }

    @Override
    public double getArea() {
        return lato * lato;
    }

    @Override
    public Poligono clone() {
        return new Quadrato(this.lato);
    }
}
