
public class ContaCorrente {
  //atributos
	
	public String nomeTitular;
	public double saldo;
	public int agConta;
	
	//métodos
	
	public void depositar(double valor) {
		this.saldo += valor;
	
	}
	
	public boolean  sacar (double valor) {
		if (this.saldo >=valor ) {
		this.saldo -= valor;
		return true;
					}

	      return false;
}
				
	public boolean  transferir (double valor, ContaCorrente contaDestino){
			if (this.saldo >=valor ) {
				this.saldo -= valor;
				contaDestino.saldo += valor;
					return true;
								}
					
							{
						return false;
		}
		
	 }
 }


