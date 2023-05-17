package controller;

import javax.swing.JOptionPane;

import br.com.serialexperimentscarina.listaobject.ListaObject;
import model.Conta;

public class TabelaBancoController implements ITabelaBancoController{
	
	ListaObject[] tabelaDeEspalhamento;

	public TabelaBancoController() {
		tabelaDeEspalhamento = new ListaObject[10];
		
		for (int i = 0; i < 10; i++) {
			tabelaDeEspalhamento[i] = new ListaObject();
		}
	}

	@Override
	public void adiciona(Conta conta) throws Exception {
		ListaObject l = tabelaDeEspalhamento[conta.hashCode()];
		l.addFirst(conta);
		
	}

	@Override
	public void remove(Conta conta) throws Exception {
		ListaObject l = tabelaDeEspalhamento[conta.hashCode()];
		int tamanho = l.size();
		
		for (int i = 0; i < tamanho; i++) {
			Conta cnt = (Conta) l.get(i);
			if(cnt.getNum() == conta.getNum() && cnt.getNomeCliente().equals(conta.getNomeCliente())) {
				l.remove(i);
				JOptionPane.showMessageDialog(null, "Conta removida com sucesso");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Conta não encontrada", "Erro", JOptionPane.ERROR_MESSAGE);
	}

	@Override
	public Conta busca(Conta conta) throws Exception {
		ListaObject l = tabelaDeEspalhamento[conta.hashCode()];
		int tamanho = l.size();
		
		for (int i = 0; i < tamanho; i++) {
			Conta cnt = (Conta) l.get(i);
			if(cnt.getNum() == conta.getNum() && cnt.getNomeCliente().equals(conta.getNomeCliente())) {
				return cnt;
			}
		}
		return null;
	}

}
