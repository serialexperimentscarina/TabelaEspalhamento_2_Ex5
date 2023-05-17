package model;

public class Conta {
	
	private int num;
	private String nomeCliente;
	private double saldo;

	public Conta() {
		super();
	}

	public Conta(int num, String nomeCliente, double saldo) {
		this.num = num;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return ("[" + nomeCliente + " (" + (String.format("%04d", num)) + ") = R$" + (String.format("%,.2f", saldo)) + "]");
	}
	
	// Função hash
	@Override
	public int hashCode() {
		return (int) (10 * ((Math.sqrt(11) * num) % 1));
	}

}
