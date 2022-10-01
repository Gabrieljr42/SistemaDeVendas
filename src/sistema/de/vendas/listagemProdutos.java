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
public class listagemProdutos {
     ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
     
     public ArrayList<Produto> geraLista(Produto produtos[]){
         for(Produto produto : produtos){
             listaDeProdutos.add(produto);
         }
         return listaDeProdutos;
     }
}
