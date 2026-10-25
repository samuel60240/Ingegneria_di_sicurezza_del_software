public class PoligonoPatternMain {

    public static void main(String[] args) {
        PoligonoFactory factory = new PoligonoFactoryImpl();

        Poligono rettangolo = factory.getShape("RETTANGOLO");
        if (rettangolo != null) {
            System.out.println("Area Rettangolo: " + rettangolo.getArea());
        }

        Poligono quadrato = factory.getShape("QUADRATO");
        if (quadrato != null) {
            System.out.println("Area Quadrato: " + quadrato.getArea());
        }

        Poligono triangolo = factory.getShape("TRIANGOLO");
        if (triangolo != null) {
            System.out.println("Area Triangolo: " + triangolo.getArea());
        }

        System.out.println("Clonazione Rettangolo:");
        Poligono rettangoloClone = rettangolo.clone();
        System.out.println("Area Rettangolo Clonato: " + rettangoloClone.getArea());
    }
}
