package estruturalComposite;

public abstract class Empregado{
	
	protected String nome = null;
	protected Double salario = null;
	 
	public Empregado(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	 
	// Exibe os detalhes do empregado
	public abstract void print();
	public abstract void add(Empregado e);
	public abstract void remove(Empregado e);
	 
}
