package br.edu.cs.poo.ac.ordem.entidades;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class FechamentoOrdemServico {
    private String numeroOrdemServico;
    private LocalDate dataFechamento;
    private boolean pago;
    private String relatorioFinal;


    public FechamentoOrdemServico(String numeroOrdemServico, LocalDate dataFechamento, boolean pago, String relatorioFinal) {
        this.numeroOrdemServico = numeroOrdemServico;
        this.dataFechamento = dataFechamento;
        this.pago = pago;
        this.relatorioFinal = relatorioFinal;
    }
}
