package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoUnhasTest {

    @Test
    void deveAgendarDepilacao() {
        IServico servico = ServicoFactory.obterServico("Unhas");
        assertEquals("Unhas agendada", servico.agendar());
    }

    @Test
    void deveCancelarDepilacao() {
        IServico servico = ServicoFactory.obterServico("Unhas");
        assertEquals("Unhas cancelada", servico.cancelar());
    }

}