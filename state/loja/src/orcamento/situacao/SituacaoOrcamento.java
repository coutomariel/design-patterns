package orcamento.situacao;

import orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calculaDescontoExtra(BigDecimal valor){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new RuntimeException("Aprovação não permitida");
    }

    public void reprovar(Orcamento orcamento){
        throw new RuntimeException("Reprovação não permitida");
    }

    public void finalizar(Orcamento orcamento){
        throw new RuntimeException("Finalização não permitida");
    }

}
