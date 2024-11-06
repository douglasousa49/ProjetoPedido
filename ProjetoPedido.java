/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetopedido;

/**
 *
 * @author douglas.ssilva72
 */
public class ProjetoPedido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntradaDados entrada = new EntradaDados();
        Pedido ped = new Pedido();        
        
        entrada.Perguntar("Informe o valor do pedido:");
        ped.valor = entrada.lerDouble();
        
        entrada.Perguntar("Informe a quantidade de parcelas:");
        ped.parcelas = entrada.lerInt();
        
        entrada.Perguntar("Informe o cupom:");
        ped.cupom = entrada.lerTexto();
        
        Response resp = ped.calcularTotal();
        
        System.out.println("Valor pedido: " + resp.lerValorTotal());
        System.out.println("Quantidade parcelas: " + resp.lerParcelas());
        System.out.println("Valor cupom: " + resp.lerValorCupom());
        System.out.println("Valor parcela: " + resp.lerValorParcela());
        
    }
    
}
