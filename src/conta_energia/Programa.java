package conta_energia;
import java.util.Date;

public class Programa {

	public static void main(String[] args) {
		
		ContaEnergia conta1 = new ContaEnergia(); // criação do objeto ContaEnergia1
		conta1.setKwGasto(53);
		conta1.setDataLeitura(new Date());
		
		ContaEnergia conta2 = new ContaEnergia(); // criação do objeto ContaEnergia2
		conta2.setKwGasto(50);
		conta2.setDataLeitura(new Date());
		
		ContaEnergia conta3 = new ContaEnergia(); // criação do objeto ContaEnergia3
		conta3.setKwGasto(20);
		conta3.setDataLeitura(new Date());
		
		Consumo consumo = new Consumo();
		
		consumo.adicionarConta(conta1);
		consumo.adicionarConta(conta2);
		consumo.adicionarConta(conta3);
		
		ContaEnergia menor = consumo.verificarMenorConsumo();
		ContaEnergia maior = consumo.verificarMaiorConsumo();
		
		System.out.println(
			"O menor consumo: " + menor.getKwGasto() + " " + maior.getDataLeitura().getTime()
		);

		System.out.println(
			"O maior consumo: " + maior.getKwGasto() + " " + maior.getDataLeitura().getTime()
		);
	}

}
