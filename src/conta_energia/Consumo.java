package conta_energia;
import java.util.ArrayList;

public class Consumo {

	private ArrayList<ContaEnergia> contas; 
	/*criação da propriedade tipo arraylist para receber um conjunto de contas energia de nome contas, 
	é privado porque só será usado aqui. Array para receber as contas*/
	
	public Consumo() {
		this.contas = new ArrayList(); 
	/* criação do construtor e inicialização da propriedade contas 
	(nem sempre é preciso inicializar).*/
	}
	
	public void adicionarConta(ContaEnergia conta) { 
		// metodo para adiconar contas dentro do arraylist.
		this.contas.add(conta);
	}
	
	public ArrayList<ContaEnergia> getContas() {
		return this.contas;
	}
	
	public ContaEnergia verificarMenorConsumo() {
		//cria uma variavel local chamado 'c' do tipo ContaEnergia
		//e coloca a primeira ContaEnergia que for adicionada no Array de contas
		ContaEnergia c = this.contas.get(0);
		
		for (ContaEnergia conta : this.contas) {
			if (conta.getKwGasto() < c.getKwGasto()) {
				c = conta;
			}
		}
		
		return c;
	}
	

	public ContaEnergia verificarMaiorConsumo() {
		ContaEnergia c = this.contas.get(0);
		
		for (ContaEnergia conta : this.contas) {
			if (conta.getKwGasto() > c.getKwGasto()) {
				c = conta;
			}
		}
		
		return c;
	}

}
