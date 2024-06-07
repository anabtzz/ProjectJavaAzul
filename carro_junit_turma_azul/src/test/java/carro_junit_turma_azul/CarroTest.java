package carro_junit_turma_azul;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarroTest {
	
   @Test
public void acelerarComSucesso(){
	 //cenario
	   CarroTest carro = new CarroTest();
	   
	   //ação
	   carro.acelerar(100);
	   
	   //verificacao
	   assertEquals(50,carro.veloAtual,0.1);
   }

   @Test
public void FreiarComSucesso(){
	 //cenario
	   CarroTest carro = new CarroTest();
	   
	   //ação
	   carro.frear(20);
	   
	   //verificacao
	   assertEquals(0,carro.veloAtual,0.1);
   }
}s
 
	
