package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCorteTest {

    @Test
    void deveAgendarCorte() {
        IServico servico = ServicoFactory.obterServico("Corte");
        assertEquals("Corte de cabelo agendado", servico.agendar());
    }

    @Test
    void deveCancelarCorte() {
        IServico servico = ServicoFactory.obterServico("Corte");
        assertEquals("Corte de cabelo cancelado", servico.cancelar());
    }

}