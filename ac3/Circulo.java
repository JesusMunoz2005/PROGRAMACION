package ac3;
public class Circulo extends PoligonoRegular{
	private int area;
	
	Circulo(){
	super();
	this.area=(int) (3.14*(radio*radio));
	}
	
	Circulo(int radio, color color){
	this.area=(int) (3.14*(radio*radio));
	this.color=color;
	}
	
	@Override
	public int getArea() {
	return area;
	}

	@Override
	public String toString(){
		
	return "El area del circulo es: "+area;
	}
}
