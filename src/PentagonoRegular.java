
public class PentagonoRegular {
	
	int Lado;//Se crea la variable lado para el desarrollo del ejercicio
	
	PentagonoRegular (int Lado)//Se hace la referencia a otra variable creada
	{
		this.Lado = Lado;//Usando "this" se hace referencia q son dos variables lados diferentes
	}
	
	int getLado ()// se hace el desarrollo de lo que se pide con int
	{
		return Lado;//Devuelve el resultado de ladp
	}
	
	void setLado(int Lado)//Se hace la funcion setLado
	{
		this.Lado = Lado;//Se hace hace referencia a el lado del set no al principal para diferenciarlos
	}
	
	int getPerimetro ()//Se calcula el perimetro con la funcion getPerimetro
	{
		return Lado*5;//Devuelve el resultado del perimetro
	}

	public static void main(String[] args) {


	}

}
