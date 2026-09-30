public class PoligonoFactoryImpl implements PoligonoFactory{
	@Override
	public Poligono getShape(String shapeType) {
		if(shapeType == null || shape.isEmpty) return null;

		swithc(shapeType.toUpperCase()){
			case "TRIANGOLO":
				return new Triangolo();
				break;
			case "QUADRATO":
				return new Quadrato();
				break;
			case "RETTANGOLO":
				return new Rettangolo();
				break;
			default:
				System.out.println("Non esiste");

		}
	}	
}
