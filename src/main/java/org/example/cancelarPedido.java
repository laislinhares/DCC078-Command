package org.example;

public class cancelarPedido implements Pedido{

    private final Item item;

    public cancelarPedido(Item item) {
        this.item = item;
    }

    public void executar() {
        this.item.cancelarItem();
    }

    public void cancelar() {
        this.item.pedirItem();
    }
}
