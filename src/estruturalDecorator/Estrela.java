package estruturalDecorator;

public class Estrela extends Decorator{
	
	public Estrela(Arvore a)
	{
		super(a);
	}
	
	public void showEnfeites()
	{
		super.showEnfeites();
		System.out.println("Estrela, ");
	}
}

