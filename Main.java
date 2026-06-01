public class Main {

    public static void main(String[] args) {

        Fila<Cliente> filaClientes = new Fila<>();

        filaClientes.adicionar(new Cliente("João", "111.111.111-11"));
        filaClientes.adicionar(new Cliente("Maria", "222.222.222-22"));

        IO.println("=== FILA DE CLIENTES ===");

        filaClientes.listar();

        IO.println("Primeiro: " + filaClientes.primeiro());

        IO.println("Removido: " + filaClientes.proximo());

        IO.println("Elementos restantes:");
        filaClientes.listar();

        IO.println("Quantidade: " + filaClientes.quantidade());

        Fila<Chamado> filaChamados = new Fila<>();

        filaChamados.adicionar(new Chamado(1, "Erro no sistema"));
        filaChamados.adicionar(new Chamado(2, "Problema de login"));

        IO.println("\n=== FILA DE CHAMADOS ===");

        filaChamados.listar();

        IO.println("Primeiro: " + filaChamados.primeiro());

        IO.println("Removido: " + filaChamados.proximo());

        IO.println("Elementos restantes:");
        filaChamados.listar();

        IO.println("Quantidade: " + filaChamados.quantidade());

        Fila<Pedido> filaPedidos = new Fila<>();

        filaPedidos.adicionar(new Pedido(1001, 250.50));
        filaPedidos.adicionar(new Pedido(1002, 399.90));

        IO.println("\n=== FILA DE PEDIDOS ===");

        filaPedidos.listar();

        IO.println("Primeiro: " + filaPedidos.primeiro());

        IO.println("Removido: " + filaPedidos.proximo());

        IO.println("Elementos restantes:");
        filaPedidos.listar();

        IO.println("Quantidade: " + filaPedidos.quantidade());
    }
}