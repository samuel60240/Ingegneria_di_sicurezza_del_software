public class Rettangolo implements Poligono {
    private double base;
    private double altezza;

    public Rettangolo() {
        this(1, 1);
    }

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double getArea() {
        return base * altezza;
    }

    @Override
    public Poligono clone() {
        return new Rettangolo(this.base, this.altezza);
    }
}
