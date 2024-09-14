package classDiagram;

import java.util.ArrayList;
import java.util.Set;

public class Pedido {
    private String codPedido;
    private Cliente cliente;
    private ArrayList<ItensPedido> itens = new ArrayList<>();

    public Pedido(String codPedido, Cliente cliente, ArrayList<ItensPedido> itens) {
        this.codPedido = codPedido;
        this.cliente = cliente;
        this.itens = itens;
    }

    public Pedido(String codPedido, Cliente cliente) {
        this.codPedido = codPedido;
        this.cliente = cliente;
    }

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void verItens() {
        for (ItensPedido iten : itens) {
            System.out.println(iten);
        }
    }

    public void setItens(ItensPedido itens) {
        this.itens.add(itens);
    }

    public void removerItens() {
        for (ItensPedido iten : itens) {
            this.itens.remove(iten);
        }
    }

    public double calcularTotal() {

        double total = 0;

        for (ItensPedido iten : itens) {
            total += iten.getTotal();
        }

        return total;
    }



    @Override
    public String toString() {
        return "\nCliente: " + cliente + "\nItens: " + itens + "\nTotal: R$ " + calcularTotal();
    }
}




