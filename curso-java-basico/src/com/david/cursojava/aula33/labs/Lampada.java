package com.david.cursojava.aula33.labs;

public class Lampada {

    private String modelo;
    private String tensao;
    private String cor;
    private String tipoDeLuz;
    private int potencia;
    private int garantiaMeses;
    private String[] tipos;
    private boolean tipoAbajur;
    private boolean ligada;

    public Lampada() {
    }

    public Lampada(String modelo, String tensao, String cor, String tipoDeLuz, int potencia, int garantiaMeses,
            String[] tipos, boolean tipoAbajur, boolean ligada) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.cor = cor;
        this.tipoDeLuz = tipoDeLuz;
        this.potencia = potencia;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.tipoAbajur = tipoAbajur;
        this.ligada = ligada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoDeLuz() {
        return tipoDeLuz;
    }

    public void setTipoDeLuz(String tipoDeLuz) {
        this.tipoDeLuz = tipoDeLuz;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getGaratiaMeses() {
        return garantiaMeses;
    }

    public void setGaratiaMeses(int garatiaMeses) {
        this.garantiaMeses = garatiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar() {
        setLigada(true);
    }

    public void desligar() {
        setLigada(false);
    }

    public void mostrarEstado() {
        if (isLigada()) {
            System.out.println("A lâmpada está ligada.");            
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

    public void mudarEstado() {
        if (isLigada()) {
            desligar();
        } else {
            ligar();
        }
    }

}
