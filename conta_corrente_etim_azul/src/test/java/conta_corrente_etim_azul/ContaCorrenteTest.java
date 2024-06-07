package conta_corrente_etim_azul;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContaCorrenteTest {

	final double VARIACAO = 0.1;
	// teste
	@Test
	public void testDepositar() {
		// Cenario
		ContaCorrente cc = new ContaCorrente();
		
		cc.depositar(100);
		assertEquals(100, cc.saldo, VARIACAO);
		
		cc.depositar(100);
		assertEquals(200, cc.saldo, VARIACAO);
		
		cc.depositar(100);
		assertEquals(300, cc.saldo, VARIACAO);
	}
	//teste
	@Test
	public void testSacar() {
		// Cenario
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		cc.sacar(100);
		assertEquals(100, cc.saldo, VARIACAO);
		//ação
		cc.sacar(100);
		assertEquals(0, cc.saldo, VARIACAO);
		
		cc.sacar(100);
		assertEquals(0, cc.saldo, VARIACAO);
	}
	@Test
	public void testSacarSuficiente() {
		// Cenario
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		//ação
		cc.sacar(100);
		assertEquals(100, cc.saldo, VARIACAO);
	
	}
	@Test
	public void testSacarInsuficinete() {
		// Cenario
		ContaCorrente cc = new ContaCorrente();
		//ação
		cc.sacar(100);
		assertEquals(0, cc.saldo, VARIACAO);
		
	}
	//teste
	@Test
	public void testTransferir() {
		// Cenario
		ContaCorrente conta1 = new ContaCorrente();
		ContaCorrente conta2 = new ContaCorrente();
		conta1.depositar(200);
		//ação
		conta1.transferir(50, conta2);
		//verificaçaõ
		
		assertEquals(150, conta1.saldo, VARIACAO);
		assertEquals(50, conta2.saldo, VARIACAO);
	}
}
