import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GarconTest {

    Garcon garcon;
    Item item;
    Item item2;

    @BeforeEach
    void setUp() {
        garcon = new Garcon();
        item = new Item ("Café");
        item2 = new Item ("Água");
    }

    @Test
    void devePedirItem() {
        Pedido pedidoFeito = new realizarPedido(item);
        garcon.executarPedido(pedidoFeito);

        assertEquals("Item pedido", item.getSituacao());
    }

    @Test
    void deveCancelarItem() {
        Pedido pedidoCancelado = new cancelarPedido(item);
        garcon.executarPedido(pedidoCancelado);

        assertEquals("Item cancelado", item.getSituacao());
    }

    @Test
    void deveCancelarCancelamentoDoItem() {
        Pedido pedidoFeito = new realizarPedido(item);
        Pedido pedidoCancelado = new cancelarPedido(item2);

        garcon.executarPedido(pedidoFeito);
        garcon.executarPedido(pedidoCancelado);

        garcon.cancelarUltimoPedido();

        assertEquals("Item pedido", item.getSituacao());
    }
}
