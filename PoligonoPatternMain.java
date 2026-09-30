public class FactoryPatternMain{

    public static void main(String[] args) {
        // Creazione dell'istanza della factory
        PoligonoFactory factory = new PoligonoFactoryImpl();

        // Ottenimento e test del Rettangolo
        Poligono rettangolo = factory.getShape("RETTANGOLO");
        if (rettangolo != null) {
            System.out.println("Area Rettangolo: " + rettangolo.getArea());
        }

        // Ottenimento e test del Quadrato
        Poligono quadrato = factory.getShape("QUADRATO");
        if (quadrato != null) {
            System.out.println("Area Quadrato: " + quadrato.getArea());
        }

        // Ottenimento e test del Triangolo
        Poligono triangolo = factory.getShape("TRIANGOLO");
        if (triangolo != null) {
            System.out.println("Area Triangolo: " + triangolo.getArea());
        }
    }
}
