package carro_junit_turma_azul;

public class CarroMain {

	public class Carro {
		//atributos
		public String marca;
		public String modelo;
		public int veloAtual;
		public double veloMax;
		public boolean ligado;


		//métodos
		// ligar
		public void ligar() {
			this.ligado = true;
		}

		// desligar
		public void desligar() {
			this.ligado = false;
		}

		// acelerar
		public boolean acelerar(int valor) {
			if (ligado == true) {
				if ((veloAtual + valor) <= veloMax ){
					this.veloAtual += valor;
					return true;
				}
				else {
					return false;
				}
			}
			
			return false;
		}

		//freio 
		public boolean frear(int valorfrear) {
			if ((veloAtual - valorfrear) > 0) {
				this.veloAtual -= valorfrear;
				return true;
			}
			 else {
				this.veloAtual = 0 ;
			}
			return false;
		}
  }
}
