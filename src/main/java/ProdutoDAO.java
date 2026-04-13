import java.util.HashMap;
import java.util.Map;

public class ProdutoDAO {
    private static Map<Integer, Produto> bdMock = new HashMap<>();

    private static int contadorId = 0;

    public void addProduto(Produto produto){
        int novoId = contadorId++;
        produto.setId(novoId);
        bdMock.put(produto.getId(), produto);
    }

    public Produto lerProduto(Integer id){
        return bdMock.get(id);
    }

    public void atualizarProduto(Produto produto){
        if (bdMock.containsKey(produto.getId())){
            bdMock.put(produto.getId(), produto);
        }
    }

    public void excluirProduto(Produto produto){
        if (bdMock.containsKey(produto.getId())) {
            bdMock.remove(produto);
        }
    }
}
