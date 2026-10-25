public class Triangolo implements Poligono {
    private double base;
    private double altezza;

    public Triangolo() {
        this(1, 1);
    }

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double getArea() {
        return base * altezza / 2;
    }

    @Override
    public Poligono clone() {
        return new Triangolo(this.base, this.altezza);
    }
}
