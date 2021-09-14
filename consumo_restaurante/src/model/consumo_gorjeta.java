/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author mylen
 */
public class consumo_gorjeta {
    
    private double consumo;
    private double gorjeta;
    private double valorFinal;

    public consumo_gorjeta() {
    }

    public consumo_gorjeta(double consumo, double gorjeta, double valorFinal) {
        this.consumo = consumo;
        this.gorjeta = gorjeta;
        this.valorFinal = valorFinal;
    }
    
    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getGorjeta() {
        return gorjeta;
    }

    public void setGorjeta(double gorjeta) {
        this.gorjeta = gorjeta;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    public void calcularGastos(double consumo){
        this.consumo = consumo;
        
        if(this.consumo >= 200){
            this.gorjeta = this.consumo * 0.10;
        }else{
            this.gorjeta = this.consumo * 0.05;
        }
        
        valorFinal = this.consumo + this.gorjeta;
    }
    
    public void mostrarValorFinal(){
        JOptionPane.showMessageDialog(null, "Valor final a ser pago\nR$ " + this.valorFinal);
    }
    
}
