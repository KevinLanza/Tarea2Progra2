
public class Rectangulo {
	
	public int Base;// Se hace la variable "Base" para el ejercicio
	public int Altura;// Se hace la variable "Altura" para el ejercicio
	
	Rectangulo(int Base, int Altura)//Se hace la formula del rectangulo
	{
		this.Base = Base;//Se usa el "this" para hacer referencia q son variables diferentes
		this.Altura = Altura;//Se usa el "this" para hacer referencia q son variables diferentes
	}
	
	int getBase ()//Se hace la funcion getBase de tipo int
	{
		return Base;//Devuelve el valor de la variable "Base"
	}
	
	void setBase (int Base)//Se hace la funcion setBase de tipo void
	{
		this.Base = Base;//Se usa "this" para diferenciar las variables 
	}
	
	int getAltura ()//Se hace la funcion getAltura de tipo int
	{
		return Altura;//Devuelve el valor de la variable altura  
	}
	
	void setAltura (int Altura)//Se hace la funcion setAltura de tipo void
	{
		this.Altura = Altura;//Se usa "this" para diferenciar las variables 
	}
	
	int getArea()//Se hace la funcion getArea de tipo int
	{
		return Base*Altura;//Devuelve le valor de la funcion Area multiplicando "Base" * "Altura"
	}
	
	int getPerimetro()//Se hace la funcion getPerimetro de tipo int
	{
		return ((Base*2)+(Altura*2));//Devuelve el valor del perimetro con respecto a su formula 
	}

	public static void main(String[] args) {


	}

}
