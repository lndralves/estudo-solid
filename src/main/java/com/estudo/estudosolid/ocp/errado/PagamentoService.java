package com.estudo.estudosolid.ocp.errado;

public class PagamentoService {

    public void fazerPagamento(String tipoDoPagamento){

        /*
        * A essência do princípio é esta: "Os detalhes variáveis ficam encapsulados nas implementações concretas."
        * Da forma que está implementado aqui, sempre que um novo tipo de pagamento surgir, teríamos que adicionar
        * um novo IF e adicionar a implementação.
        *
        * Isso é ruim, pois, o código da classe PagamentoService deveria ser mais estável e testável, e isso
        * acaba sendo comprometido, pois sempre acaba sendo modificada por conta dos detalhes variáveis da implementação
        * dos tipos concretos.
        *
        * O ideal é que lógica principal de fazer pagamentos dependa de abstrações/interfaces.
         * */
        if(tipoDoPagamento == "pix"){
            // pagar com pix
        } else if(tipoDoPagamento == "credito"){
            // pagar com crédito
        } else if(tipoDoPagamento == "bitcoin"){
            // pagar com bitcoin
        }

    }

}
