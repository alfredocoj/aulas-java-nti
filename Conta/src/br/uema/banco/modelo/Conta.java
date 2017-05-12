package br.uema.banco.modelo;

import java.util.Calendar;

import br.uema.banco.excecoes.SaldoInsuficienteException;

/**
 * Conta - Armazena informacoes dos dados bancários dos usuários
 * @author Alfredo Costa
 *
 */
public class Conta {
	private String nome;
	private double saldo;
	private Calendar dataAbertura;
	
	/**
	 * Construtor da classe Conta
	 * @param nome {@link String}
	 * @param data {@link Calendar}
	 */	
	public Conta(String nome, Calendar data) {
		this.nome = nome;
		this.dataAbertura = data;
	}

	/**
	 * getNome - metodo get para obter nome
	 * @return {@link String} nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * setNome - metodo set nome
	 * @param nome {@link String}
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * getSaldo - metodo get para obter saldo
	 * @return {@link String} saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * setNome - metodo set nome
	 * @param saldo double
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * getDataAbertura - metodo get para obter a data de abertura da conta
	 * @return {@link Calendar} dataAbertura
	 */
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	
	/**
	 * setDataAbertura - metodo set a data de Abertura
	 * @param dataAbertura {@link Calendar}
	 */
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	/**
	 * recebe - metodo que recebe valor informado
	 * @param valor double
	 */
	public void recebe(double valor) {
		this.saldo += valor;
	}

	/**
	 * saca - metodo que saca valor informado
	 * @param valor double
	 * @exception IllegalArgumentException se de valor ilegal
	 * @exception SaldoInsuficienteException se saldo insuficiente
	 */
	public void saca(double valor) {
		if(valor < 0)
			throw new IllegalArgumentException("Valor inválido");
		if(valor > this.saldo)
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		
		this.saldo -= valor;
	}
}
