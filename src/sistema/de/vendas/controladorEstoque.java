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
public class controladorEstoque {
    ArrayList<Estoque> listaDeEstoque = new ArrayList<Estoque>();
    public void entraEstoque(int quantidade, int id){
        Estoque estoque = new Estoque(quantidade,id);
        listaDeEstoque.add(estoque);
    }
    public void compraEstoque(int quantidade,int id){
        Estoque estoque = new Estoque(quantidade,id);
        listaDeEstoque.remove(estoque);
    }
    public boolean temEmEstoque(Estoque estoque){
        if(listaDeEstoque.contains(estoque)){
            return true;
        }
        return false;
    }
}
