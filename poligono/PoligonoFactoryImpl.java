public class PoligonoFactoryImpl implements PoligonoFactory {
    @Override
    public Poligono getShape(String shapeType) {
        if (shapeType == null || shapeType.trim().isEmpty()) {
            return null;
        }

        switch (shapeType.trim().toUpperCase()) {
            case "TRIANGOLO":
                return new Triangolo(3, 4);
            case "QUADRATO":
                return new Quadrato(5);
            case "RETTANGOLO":
                return new Rettangolo(4, 6);
            default:
                System.out.println("Non esiste");
                return null;
        }
    }
}
