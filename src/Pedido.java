import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    int id;
    Cliente cliente;
    Produto produto;
    Date data;

    public void adicionarProduto(Produto produto) {
        List<Produto> Carrinho = new ArrayList<>();
        Carrinho.add(produto);
    }
}