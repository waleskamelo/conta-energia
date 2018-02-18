package conta_energia;
import java.util.Date;

public class ContaEnergia {

	//criação das propriedades
	private int id = 12345;
	private Date dataLeitura ;
	private double numeroLeitura;
	private int kwGasto;
	private double valorPago;
	private Date dataPagamento;
	
	//criação de getters e setters das propriedades.
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataLeitura() {
		return this.dataLeitura;
	}

	public void setDataLeitura(Date dataLeitura) {
		this.dataLeitura = dataLeitura;
	}

	public double getNumeroLeitura() {
		return this.numeroLeitura;
	}

	public void setNumeroLeitura(double numeroLeitura) {
		this.numeroLeitura = numeroLeitura;
	}

	public int getKwGasto() {
		return this.kwGasto;
	}

	public void setKwGasto(int kwGasto) {
		this.kwGasto = kwGasto;
	}

	public double getValorPago() {
		return this.valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public Date getDataPagamento() {
		return this.dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	//construtor da ContaEnergia, é necessario pois quando for criar o objeto (new) ele irá acessa-lo a partir daqui.3
	public ContaEnergia() {
		
	}

	

}

