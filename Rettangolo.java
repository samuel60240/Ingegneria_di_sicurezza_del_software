Public class Rettangolo implements Poligono{
	
	private int base;
	private int altezza;

	public Rettangolo(int base, int altezza){
		this.base = base;
		this.altezza = altezza;
	}

	public int getArea(){
		return base*altezza;	
	}


}
