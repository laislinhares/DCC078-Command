package org.example;

import java.util.ArrayList;
import java.util.List;

public class Garcon {

    private final List<Pedido> pedidos = new ArrayList<Pedido>();

    public void executarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
        pedido.executar();
    }

    public void cancelarUltimoPedido() {
        if (!pedidos.isEmpty()) {
            Pedido pedido = this.pedidos.get(this.pedidos.size() - 1);
            pedido.cancelar();
            this.pedidos.remove(this.pedidos.size() - 1);
        }
    }
}
