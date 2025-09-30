package br.edu.cs.poo.ac.ordem.entidades;

import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class Equipamento implements Serializable {
    private String descricao;
    private Dificuldade tipo;
    private boolean ehNovo;
    private double valorEstimado;
}