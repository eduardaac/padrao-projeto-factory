package padroescriacao.factorymethod;

public class ServicoUnhas implements IServico {

    public String agendar() {
        return "Unhas agendada";
    }

    public String cancelar() {
        return "Unhas cancelada";
    }
}
