package padroescriacao.factorymethod;

public class ServicoDepilacao implements IServico{

    public String agendar() {
        return "Depilação agendada";
    }

    public String cancelar() {
        return "Depilação cancelada";
    }
}
