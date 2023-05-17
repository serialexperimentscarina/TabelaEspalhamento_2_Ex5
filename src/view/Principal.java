package view;

import javax.swing.JOptionPane;

import controller.TabelaBancoController;
import model.Conta;

public class Principal {

	public static void main(String[] args) {
		TabelaBancoController tabela = new TabelaBancoController();
		String input = "", nomeCliente;
		int num;
		double saldo;
		
		do {
			try {
				input = JOptionPane.showInputDialog("MENU: \n1 - Adicionar conta \n2 - Remover conta \n3 - Buscar conta \n4 - Sair", "");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrando.");
					System.exit(0);
				} else {
					switch (input) {
						case("1"):
							do {
								num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
								if (num > 9999) {
									JOptionPane.showMessageDialog(null, "Número deve ter no máximo 4 dígitos, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
								}
							} while (num > 9999);
							nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");
							saldo  = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo do cliente: "));
							tabela.adiciona(new Conta(num, nomeCliente, saldo));
							break;
						case("2"):
							do {
								num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
								if (num > 9999) {
									JOptionPane.showMessageDialog(null, "Número deve ter no máximo 4 dígitos, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
								}
							} while (num > 9999);
							nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");
							tabela.remove(new Conta(num, nomeCliente, 0));
							break;
						case("3"):
							do {
								num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
								if (num > 9999) {
									JOptionPane.showMessageDialog(null, "Número deve ter no máximo 4 dígitos, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
								}
							} while (num > 9999);
							nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");
							Conta contaBuscada = tabela.busca(new Conta(num, nomeCliente, 0));
							if (contaBuscada != null) {
								JOptionPane.showMessageDialog(null, contaBuscada);
							} else {
								JOptionPane.showMessageDialog(null, "Conta não encontrada", "Erro", JOptionPane.ERROR_MESSAGE);
							}
							break;
					}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Houve um erro durante a execução", "Erro", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		} while (!input.equals("4"));
		JOptionPane.showMessageDialog(null, "Encerrando.");
	}

}
