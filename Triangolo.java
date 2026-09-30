public class Triangolo implements Poligono{
	private int base;
	private int altezza;

	public Triangolo(int base, int altezza){
		this.base=base;
		this.altezza=altezza;
	}	
	
	public int getArea(){
		return base*altezza/2;
	}
}
