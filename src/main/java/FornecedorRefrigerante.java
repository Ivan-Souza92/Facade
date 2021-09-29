

public class FornecedorRefrigerante extends Pedido{

    private static FornecedorRefrigerante fornecedorRefrigerante = new FornecedorRefrigerante();

    public static FornecedorRefrigerante getInstance(){

        return fornecedorRefrigerante;
    }

}
