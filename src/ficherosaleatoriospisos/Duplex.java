/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosaleatoriospisos;

/**
 *
 * @author a20pelayoar
 */
public class Duplex extends Piso {

    float cuotaExtra;

    public Duplex(String referencia, String nomPropietario, float cuota,
            float agua, float calefa) {
        this.referencia = referencia;
        tipoPiso = 'D';
        this.nomPropietario = nomPropietario;
        this.cuota = cuota;
        this.agua = agua;
        this.calefa = calefa;
        totalRbo = totalRbo();
    }

    @Override
    public float totalRbo() {
        return totalRbo = cuota + agua * 0.50f + calefa * 0.70f + cuotaExtra;
    }

    public float getCuotaExtra() {
        return cuotaExtra;
    }

    public void setCuotaExtra(float cuotaExtra) {
        this.cuotaExtra = cuotaExtra;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public char getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(char tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public String getNomPropietario() {
        return nomPropietario;
    }

    public void setNomPropietario(String nomPropietario) {
        this.nomPropietario = nomPropietario;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public float getAgua() {
        return agua;
    }

    public void setAgua(float agua) {
        this.agua = agua;
    }

    public float getCalefa() {
        return calefa;
    }

    public void setCalefa(float calefa) {
        this.calefa = calefa;
    }

    public float getTotalRbo() {
        return totalRbo;
    }

    public void setTotalRbo(float totalRbo) {
        this.totalRbo = totalRbo;
    }

    
    
}
