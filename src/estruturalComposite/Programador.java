package estruturalComposite;

// Leaf
public class Programador extends Empregado{
	
	

	public Programador(String nome, Double salario) {
		super(nome, salario);
	}

	public void print() {
		System.out.println(super.nome + ", $ " + super.salario);
	}

	public void add(Empregado e) {
		System.out.println("Nao e possivel adicionar empregado subordinado do programador");
	}

	public void remove(Empregado e) {
		System.out.println("Nao e possivel remove empregado subordinado do programador");
	}
	
	
}
