package com.estudo.estudosolid.ocp.correto;

public class PagamentoService {

    /*
    * Desta forma, o código da classe 'principal' não varia de acordo com novos tipos de pagamento, tornando-o
    * mais estável e testável. Aqui estamos dependendo apenas de abstrações/interfaces.
    * */
    void fazerPagamento(String tipoDoPagamento) {
        final PagamentoInterface metodoDePagamento = MetodoDePagamentoFactory.getMetodoDePagamento(tipoDoPagamento);
        metodoDePagamento.fazerPagamento();
    }

}
