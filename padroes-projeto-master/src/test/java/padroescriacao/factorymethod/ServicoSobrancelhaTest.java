package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoSobrancelhaTest {

    @Test
    void deveAgendarSobrancelha() {
        IServico servico = ServicoFactory.obterServico("Sobrancelha");
        assertEquals("Sobrancelha agendada", servico.agendar());
    }

    @Test
    void deveCancelarDepilacao() {
        IServico servico = ServicoFactory.obterServico("Sobrancelha");
        assertEquals("Sobrancelha cancelada", servico.cancelar());
    }

}