
public class CARRO {

	public String Marca;
	public String Modelo;
	public int ValorAtual;
	public double ValorMax;
	public boolean ligado;
    public int Valor;



	public void ligar() {
		// Se o velocidade do carro foi maior que 0, o carro está ligado 
		this.ligado=true;
	}

	public void desligar() {
		// Se o velocidade do carro foi = a 0, o carro está desligado 
		this.ligado=false; 

	}

	public boolean acelerar( int ValorAtual, int VeloRec) {
		if (this.ligado == true) 
			if (ValorAtual  <= ValorMax);
		return true;
	}
	


}
	