/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.vendas;

/**
 *
 * @author 0039246
 */
public class controladorFornecedor {
    public void vendaProduto(Produto produto, int quantidade){
        controladorEstoque controladorestoque = new controladorEstoque();
        controladorestoque.entraEstoque(produto.id,quantidade);
    }
}
