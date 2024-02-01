package ac3;
public class Cuadrado extends PoligonoRegular {
	private int area;
	
	
	Cuadrado(int ladoCuadrado, color color){
	this.area=ladoCuadrado*ladoCuadrado;
	this.color=color;
	}
	
	Cuadrado(){
	super();
	this.area=lado*lado;
	}
	
	@Override
	public int getArea() {
		return area;
	}
	
	@Override
	public String toString(){
		
		return "El area del cuadrado es: "+area;
	}
}

