package aula3;

import aula2.Trilha;
import java.util.List;
import static java.util.Arrays.asList;

public class Agenda {

    public List<Trilha> prepararTrilhas() {
        SessaoDaManha umaSessaoDaManha = new SessaoDaManha();
        SessaoDaManha outraSessaoDaManha = new SessaoDaManha();

        SessaoDaTarde umaSessaoDaTarde = new SessaoDaTarde();
        SessaoDaTarde outraSessaoDaTarde = new SessaoDaTarde();

        adicionarPalestrasSePossivel(umaSessaoDaManha, listaDePalestras);
        adicionarPalestrasSePossivel(outraSessaoDaManha, listaDePalestras);

        adicionarPalestrasSePossivel(umaSessaoDaTarde, listaDePalestras);
        adicionarPalestrasSePossivel(outraSessaoDaTarde, listaDePalestras);

        final String nomeDaTrilha1 = "Papo Reto";
        Trilha trilha1 = new Trilha(nomeDaTrilha1, umaSessaoDaManha, umaSessaoDaTarde);
        final String nomeDaTrilha2 = "Digital";
        Trilha trilha2 = new Trilha(nomeDaTrilha2, outraSessaoDaManha, outraSessaoDaTarde);
        return asList(trilha1, trilha2);

    }
}
