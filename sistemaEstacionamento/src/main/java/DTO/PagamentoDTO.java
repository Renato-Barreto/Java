/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author aluno.den
 */
public class PagamentoDTO 
{
    private int idPagamento;
    private float valor;
    private String tipoPagamento;
    private String dataHora;
    private int FKveiculo;
    private int FKvaga;

    /**
     * @return the idPagamento
     */
    public int getIdPagamento() {
        return idPagamento;
    }

    /**
     * @param idPagamento the idPagamento to set
     */
    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the tipoPagamento
     */
    public String getTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * @param tipoPagamento the tipoPagamento to set
     */
    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    /**
     * @return the dataHora
     */
    public String getDataHora() {
        return dataHora;
    }

    /**
     * @param dataHora the dataHora to set
     */
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    /**
     * @return the FKveiculo
     */
    public int getFKveiculo() {
        return FKveiculo;
    }

    /**
     * @param FKveiculo the FKveiculo to set
     */
    public void setFKveiculo(int FKveiculo) {
        this.FKveiculo = FKveiculo;
    }

    /**
     * @return the FKvaga
     */
    public int getFKvaga() {
        return FKvaga;
    }

    /**
     * @param FKvaga the FKvaga to set
     */
    public void setFKvaga(int FKvaga) {
        this.FKvaga = FKvaga;
    }
}
