package padroescriacao.factorymethod;

public class ServicoSobrancelha implements IServico {

    public String agendar() { return "Sobrancelha agendada"; }

    public String cancelar() {
        return "Sobrancelha cancelada";
    }
}
