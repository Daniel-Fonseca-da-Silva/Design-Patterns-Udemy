package estruturalComposite;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empregado{
	
	public Gerente(String nome, Double salario) {
		super(nome, salario);
	}

	// Collection of child graphics
	private List<Empregado> listaSubordinados = new ArrayList<>();	
	
	// Exibe estrutura com um foreach
	public void print() 
	{
		System.out.println(super.nome + ", $" + super.salario);
		
		for(Empregado empregado : listaSubordinados)
		{
			empregado.print();
		}
	}
	// Adiciona empregado na lista
	public void add(Empregado e) 
	{
		listaSubordinados.add(e);
	}
	// Remove empregado da lista
	public void remove(Empregado e) 
	{
		listaSubordinados.remove(e);
	}
	
}
