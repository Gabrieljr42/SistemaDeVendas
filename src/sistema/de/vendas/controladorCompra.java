/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.vendas;

import java.util.ArrayList;

/**
 *
 * @author 0039246
 */
public class controladorCompra {
    public void geraCompra(Produto produtos[]){
        Compra compra = new Compra();
        Cupom cupom = new Cupom();
        listagemProdutos listagemprodutos = new listagemProdutos();
        compra.valor = 0;
        for(int x = 0; x != produtos.length;x++){
            compra.valor += produtos[x].preço;
        }
        cupom.valor =  compra.valor;
        ArrayList<Produto> listaDeProdutos = listagemprodutos.geraLista(produtos);
        compra.paga = true;
    }
    
}
