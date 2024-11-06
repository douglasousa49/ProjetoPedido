/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopedido;

/**
 *
 * @author douglas.ssilva72
 */
public class Response {
    
    private double valorFinal;
    private double valorParcela;
    private int parcelas;
    private double valorCupom;

    public Response(double valorFinal, double valorParcela, int parcelas, double valorCupom){
        this.valorFinal = valorFinal;
        this.valorParcela = valorParcela;
        this.parcelas = parcelas;
        this.valorCupom = valorCupom;
    }
    
    public double lerValorTotal(){
        return this.valorFinal;
    }
    
    public double lerValorParcela(){
        return this.valorParcela;
    }
    
    public int lerParcelas(){
        return this.parcelas;
    }
    
    public double lerValorCupom(){
        return this.valorCupom;
    }
    
}
