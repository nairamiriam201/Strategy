package pagamento;

public class Main {

    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(200, new CartaoCreditoStrategy());
        System.out.println("Pagamento com Cartao: R$ " + pedido1.calcularTotal());

        Pedido pedido2 = new Pedido(200, new PixStrategy());
        System.out.println("Pagamento com Pix: R$ " + pedido2.calcularTotal());

        Pedido pedido3 = new Pedido(200, new BoletoStrategy());
        System.out.println("Pagamento com Boleto: R$ " + pedido3.calcularTotal());
        
        Pedido pedido4 = new Pedido(200, new CartaoCreditoStrategy());
        System.out.println("\nCriado com Cartao: R$ " + pedido4.calcularTotal());

        System.out.println("\nAlterando forma de pagamento...");
        pedido4.alterarEstrategia(new PixStrategy());

        System.out.println("Novo total com Pix: R$ " + pedido4.calcularTotal());
    }
}