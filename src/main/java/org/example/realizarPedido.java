package org.example;

public class realizarPedido implements Pedido {

    private final Item item;

    public realizarPedido(Item item) {
        this.item = item;
    }

    public void executar() {
        this.item.pedirItem();
    }

    public void cancelar() {
        this.item.cancelarItem();
    }
}
