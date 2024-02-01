package ac3;
public class Triangulo extends PoligonoRegular implements Comparable<Triangulo> {
	private int area;
	
	Triangulo(){
	this.area=(base*altura)/2;	
	}
	
	Triangulo(int base, int altura, color color){
	this.area=(base*altura)/2;	
	this.color=color;
	}
	
	@Override
	public int getArea() {
		return area;
	}
	
	@Override
	public String toString(){
		
		return "El area del triangulo es: "+area;
	}

	 @Override
	 public int compareTo(Triangulo triangulo) {
	 return this.color.compareTo(triangulo.color);
	 }
}
