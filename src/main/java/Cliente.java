

public class Cliente {

    public boolean pedido(){
         return ClienteFacade.solicitarPedido(this);
    }
}
