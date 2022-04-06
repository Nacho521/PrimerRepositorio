package Ejercicio4;

public class Multiplicacion implements InterfaceM{

	//Atributos
	int x;
	int y;
	int aux=0;
	int aux2;
	int resultado=0;
	int resultado1=0;

	//Constructor
	public Multiplicacion(int k,int j){

		this.x=k;
		this.y=j;

	}

	//Decremento de a uno (en el cual es constante) el segundo valor que me pasan.
	public void decrementoConstante(){

		int aux2=y;

		while( 0!=aux2 ){

			this.aux = this.aux + this.x; 
			aux2--;

		}

		System.out.printf("El numero de su multiplicación es: " + this.aux);

	}

	//Decremento por un factor comun ambos miembros
	public void factorComun(){

		if(x % 2 == 0){

			resultado = (x/2) * (2*y);

			System.out.printf("El resultado es:"+this.resultado);

		} else {

			if(x > 1) {

				resultado1 = ((x-1)/2)*(2*y) + y;

				System.out.printf("El resultado es:"+this.resultado1);

			} else if (x == 1){

				System.out.printf("El resultado es:"+y);

			}  else {

				System.out.printf("El resultado no se puede hacer, ya que no cumple con la condicion");
			}
 
		}

	}

}