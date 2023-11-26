package org.example;

public class Item {
    private String nome;
    private String situacao;

    public Item(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void pedirItem() {
        this.situacao = "Item pedido";
    }

    public void cancelarItem() {
        this.situacao = "Item cancelado";
    }
}

