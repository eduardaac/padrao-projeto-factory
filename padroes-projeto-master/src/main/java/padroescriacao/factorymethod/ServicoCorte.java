package padroescriacao.factorymethod;

public class ServicoCorte implements IServico {

    public String agendar() {
        return "Corte de cabelo agendado";
    }

    public String cancelar() {
        return "Corte de cabelo cancelado";
    }
}
