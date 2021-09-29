


public class FornecedorPizza extends Pedido{

    private static FornecedorPizza fornecedorPizza = new FornecedorPizza();

    public static FornecedorPizza getInstance(){

        return fornecedorPizza;
    }
}
