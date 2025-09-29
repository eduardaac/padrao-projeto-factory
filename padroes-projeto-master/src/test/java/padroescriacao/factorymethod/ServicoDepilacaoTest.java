package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoDepilacaoTest {

    @Test
    void deveAgendarDepilacao() {
        IServico servico = ServicoFactory.obterServico("Depilacao");
        assertEquals("Depilação agendada", servico.agendar());
    }

    @Test
    void deveCancelarDepilacao() {
        IServico servico = ServicoFactory.obterServico("Depilacao");
        assertEquals("Depilação cancelada", servico.cancelar());
    }

}