package com.estudo.estudosolid.lsp.errado;

public class ContaDeInvestimento implements ContaBancariaInterface{

    @Override
    public void sacar(final double valor) {

        /*
         * Quando a conta for do tipo investimento, será lançada uma exceção. Isso fere o princípio de Liskov,
         * pois gera um comportamento inesperado no código cliente. A classe ContaDeInvestimento não consegue
         * executar da forma esperada um comportamento de seu tipo superior, gerando problemas no código cliente.
         * */

        throw new UnsupportedOperationException("Não suporta saque direto.");
    }

    @Override
    public void depositar(final double valor) {
        // Lógica para depositar
    }
}
