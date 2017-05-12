package br.uema.banco.testes;
import java.util.Calendar;

import br.uema.banco.modelo.Conta;

public class TestaSacaEDeposita {

	public static void main(String[] args) {

		Conta conta = new Conta("Alfredo", Calendar.getInstance());

		conta.recebe(100.00);
		conta.saca(50.00);
		System.out.println(conta.getDataAbertura().getTime());
		System.out.println(conta.getSaldo());
		
		try{
			conta.saca(10000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try{
			conta.saca(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
