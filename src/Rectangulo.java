
public class Rectangulo {
	
	public int Base;
	public int Altura;
	
	Rectangulo(int Base, int Altura)
	{
		this.Base = Base;
		this.Altura = Altura;
	}
	
	int getBase ()
	{
		return Base;
	}
	
	void setBase (int Base)
	{
		this.Base = Base;
	}
	
	int getAltura ()
	{
		return Altura;
	}
	
	void setAltura (int Altura)
	{
		this.Altura = Altura;
	}
	
	int getArea()
	{
		return Base*Altura;
	}
	
	int getPerimetro()
	{
		return ((Base*2)+(Altura*2));
	}

	public static void main(String[] args) {


	}

}
