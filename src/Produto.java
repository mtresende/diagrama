import java.util.ArrayList;
import java.util.List;

public class Produto {
    int id;
    String nome;
    double preco;
    int quant;

    public void cadastrar(Produto produto) {
        List<Produto> ListaDeProdutos = new ArrayList<>();
        ListaDeProdutos.add(produto);
    }
}