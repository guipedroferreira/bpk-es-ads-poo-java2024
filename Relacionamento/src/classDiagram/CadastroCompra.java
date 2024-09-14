package classDiagram;

import java.util.ArrayList;

public class CadastroCompra {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Guilherme", "11166050904");
        cliente.setEnderecoClientes(new EnderecoCliente("logradouro", "1", "nao sei", "bairro", "Toledo", "PR", "85430-00", true));
        Pedido pedido = new Pedido("01", cliente, new ArrayList<>());
        pedido.setItens(new ItensPedido(1, new Produto("01", "Produto", 2)));
        pedido.setItens(new ItensPedido(2, new Produto("02", "Produto", 3)));
        System.out.println(pedido.toString());
    }
}
