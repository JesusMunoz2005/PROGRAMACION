package ac3;
public abstract class PoligonoRegular implements Figura {
protected int lado;
protected int base;
protected int altura;
protected int radio;
public enum color{Azul,Rojo,Verde,Amarillo};
protected color color;
static int contadorPoligonos;
	
	protected PoligonoRegular() {
	this.lado=10;
	this.base=10;
	this.altura=10;
	this.radio=10;
	this.color=color.Azul;
	contadorPoligonos++;
	}

	public abstract int getArea();

	public static int getContadorPoligonos() {
		return contadorPoligonos;
	}
}

