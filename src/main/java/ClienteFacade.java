

public class ClienteFacade {

    public static boolean solicitarPedido(Cliente cliente){

        if(FornecedorPizza.getInstance().validarPedido(cliente)){

            return true;
        }

        if(FornecedorRefrigerante.getInstance().validarPedido(cliente)){

            return false;
        }

        return true;
    }
}
