import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void RetornaPedidoPizzaAdicionado(){

        Cliente cliente = new Cliente();

        FornecedorPizza.getInstance().addPedidoCliente(cliente);
        assertEquals(true,cliente.pedido());
    }

    @Test
    void RetornaPedidoGuaranaNaoAdicionado(){
        Cliente cliente = new Cliente();

        FornecedorRefrigerante.getInstance().addPedidoCliente(cliente);
        assertEquals(false,cliente.pedido());
    }

    @Test
    void RetornaPedidoFeitoComSucesso(){

        Cliente cliente = new Cliente();

        assertEquals(true,cliente.pedido());
    }

}