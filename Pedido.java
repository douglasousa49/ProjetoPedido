/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopedido;

/**
 *
 * @author douglas.ssilva72
 */
public class Pedido {
    
    public double valor;
    public int parcelas;
    public String cupom;
    
    public Response calcularTotal(){
        
        double total = this.valor;
        
        double valorCupom = 0;
        
        if (this.parcelas > 1){
            total += this.valor * 0.05;
        }
        
        if (cupom.equals("QUERO50")){
            valorCupom = 50;
            total -= valorCupom;
        }
        
        double valorParcela = total / this.parcelas;
        
        Response x = new Response(total, valorParcela, this.parcelas, valorCupom);
        
        return x;      
    } 
}