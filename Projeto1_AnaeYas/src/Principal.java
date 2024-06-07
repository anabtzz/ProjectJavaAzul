
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
		cc1.nomeTitular = "Aline";
		cc2.nomeTitular = "Cidade";
		
		System.out.println("Teste1");
		cc1.depositar(200);
		System.out.println("Saldo de " + cc1.nomeTitular + "deve ser: 200 ");
		System.out.println("Saldo de " + cc1.nomeTitular + "é:  "  + cc1.saldo);
		
		System.out.println("Teste2");
		cc1.depositar(500);
		System.out.println("Saldo de " + cc1.nomeTitular + "deve ser: 500 ");
		System.out.println("Saldo de " + cc1.nomeTitular + "é:  "  + cc1.saldo);
		
		System.out.println("Teste3");
		boolean sucesso = cc1.sacar(200);
		System.out.println("Saque de " + cc1.nomeTitular + "deve ser: 300 ");
		System.out.println("Saque de " + cc1.nomeTitular + "é:  "  + cc1.saldo + cc1.sacar(300));
		System.out.println("Sucesso da op. deve ser: true ");
		System.out.println("Sucesso da op. é:" + sucesso);

		System.out.println("Teste4");
		sucesso = cc1.sacar(400);
		System.out.println("Saque de " + cc1.nomeTitular + "deve ser: 400 ");
		System.out.println("Saque de " + cc1.nomeTitular + "é:  "  + cc1.saldo + cc1.sacar(400));
		System.out.println("sucesso da op. deve ser: false ");
		System.out.println("sucesso da op. é:" + sucesso);
		
		

		System.out.println("Teste5");
		sucesso = cc1.transferir(200,cc2);
		System.out.println("Saque de " + cc1.nomeTitular + "deve ser: 100 ");
		System.out.println("Saque de " + cc1.nomeTitular + "é:  "  + cc1.saldo);
		System.out.println("Saque de " + cc2.nomeTitular + "deve ser: 100 ");
		System.out.println("Saque de " + cc2.nomeTitular + "é:  "  + cc2.saldo );
		System.out.println("sucesso da op. deve ser: true ");
		System.out.println("sucesso da op. é:" + sucesso);
 
		
	}
}
