package aula2;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Trilha {

    private String nome;
    private SessaoDaManha sessaoDaManha;
    private SessaoDaTarde sessaoDaTarde;
    private List atividadesAgendadas;

    public Trilha(String nome, SessaoDaManha sessaoDaManha, SessaoDaTarde sessaoDaTarde) {
        this.nome = nome;
        atividadesAgendadas = new ArrayList<>();

        LocalTime horarioCalculado = sessaoDaManha.comecaAs();
        for(Palestra palestra : sessaoDaManha) {

            palestra.agendarPara(horarioCalculado);
            atividadesAgendadas.add(palestra);

            horarioCalculado = horarioCalculado.plusMinutes((palestra.lerTempoDeDuracao().toInt()));
        }
        agendarAlmoco();

        horarioCalculado = sessaoDaTarde.comecaAs();
        for(Palestra palestra : sessaoDaTarde) {

            palestra.agendarPara(horarioCalculado);
            atividadesAgendadas.add(palestra);

            int tempoDeDuracaoEmMinutos = palestra.lerTempoDeDuracao().toInt();
            horarioCalculado = horarioCalculado.plusMinutes(tempoDeDuracaoEmMinutos);
        }
        agendarNetworking();
    }

}
