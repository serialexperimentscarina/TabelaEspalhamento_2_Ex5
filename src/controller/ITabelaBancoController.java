package controller;

import model.Conta;

public interface ITabelaBancoController {

	// Tabela de espalhamento para resolver o problema de inserir, consultar e remover para um banco
	public void adiciona(Conta conta) throws Exception;
	public void remove(Conta conta) throws Exception;
	public Conta busca(Conta conta) throws Exception;
	
}
