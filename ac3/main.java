package ac3;

import java.util.Arrays;

import ac3.PoligonoRegular.color;

public class main {
public static void main(String[] args) {

PoligonoRegular Figuras[]= new PoligonoRegular[5];

Figuras[0]=new Triangulo();
Figuras[1]=new Circulo();
Figuras[2]=new Cuadrado();
Figuras[3]=new Triangulo();
Figuras[4]=new Cuadrado(30,color.Amarillo);

for (int i = 0; i < Figuras.length; i++) {
	System.out.println(Figuras[i]);
}

System.out.println("_______________________");

System.out.println("El numero de poligonos es: "+PoligonoRegular.getContadorPoligonos());

System.out.println("_______________________");

Triangulo[] triangulos = {
        new Triangulo(3, 4, color.Amarillo),
        new Triangulo(5, 7, color.Azul),
        new Triangulo(6, 2, color.Verde),
        new Triangulo(4, 4, color.Rojo),
        new Triangulo(8, 5, color.Amarillo)
};

Arrays.sort(triangulos);

System.out.println("Array de Triangulos ordenado por color:");
for (Triangulo triangulo : triangulos) {
    System.out.println(triangulo);
}
}
 }

