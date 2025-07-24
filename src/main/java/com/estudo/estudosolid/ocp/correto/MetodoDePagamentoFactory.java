package com.estudo.estudosolid.ocp.correto;

public class MetodoDePagamentoFactory {

    public static PagamentoInterface getMetodoDePagamento(String tipoDoPagamento){
        if(tipoDoPagamento.equals("pix")){
            return  new PagamentoComPix();
        } else if(tipoDoPagamento.equals("credito")){
            return  new PagamentoComCredito();
        } else if(tipoDoPagamento.equals("bitcoin")){
            return  new PagamentoComBitcoin();
        }

        throw new UnsupportedOperationException("Tipo de pagamento inválido.");
    }

}
