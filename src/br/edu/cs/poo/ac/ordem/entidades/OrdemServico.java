package br.edu.cs.poo.ac.ordem.entidades;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class OrdemServico {
    private Cliente cliente;
    private PrecoBase precoBase;
    private Notebook notebook;
    private Desktop desktop;
    private LocalDateTime dataHoraAbertura;
    private int prazoEmDias;
    private double valor;

  
    public OrdemServico(Cliente cliente, PrecoBase precoBase, Notebook notebook, Desktop desktop,
                        LocalDateTime dataHoraAbertura, int prazoEmDias, double valor) {
        this.cliente = cliente;
        this.precoBase = precoBase;
        this.notebook = notebook;
        this.desktop = desktop;
        this.dataHoraAbertura = dataHoraAbertura;
        this.prazoEmDias = prazoEmDias;
        this.valor = valor;
    }

    public LocalDate getDataEstimadaEntrega() {
        return dataHoraAbertura.toLocalDate().plusDays(prazoEmDias);
    }

    public String getNumero() {
        String equipamentoId = (notebook != null) ? notebook.getIdTipo() : desktop.getIdTipo();
        String data = String.format("%04d%02d%02d%02d%02d",
                dataHoraAbertura.getYear(),
                dataHoraAbertura.getMonthValue(),
                dataHoraAbertura.getDayOfMonth(),
                dataHoraAbertura.getHour(),
                dataHoraAbertura.getMinute());

        String cpfCnpj = cliente.getCpfCnpj();
        if (cpfCnpj.length() == 14) { // CNPJ
            return equipamentoId + data + cpfCnpj;
        } else { // CPF
            return dataHoraAbertura.getMonthValue()
                    + String.valueOf(dataHoraAbertura.getYear())
                    + dataHoraAbertura.getDayOfMonth()
                    + dataHoraAbertura.getHour()
                    + dataHoraAbertura.getMinute()
                    + "000"
                    + cpfCnpj;
        }
    }
}
