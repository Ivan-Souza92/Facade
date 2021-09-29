import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {

    private List<Cliente> pedidoCliente = new ArrayList<Cliente>();

    public void addPedidoCliente(Cliente cliente){

        this.pedidoCliente.add(cliente);
    }

    public boolean validarPedido(Cliente cliente){

        return this.pedidoCliente.contains(cliente);
    }

}
