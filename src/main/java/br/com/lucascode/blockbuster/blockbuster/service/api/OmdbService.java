package br.com.lucascode.blockbuster.blockbuster.service.api;

import br.com.lucascode.blockbuster.blockbuster.model.DadosSerie;
import br.com.lucascode.blockbuster.blockbuster.service.utils.ConverteDados;
import org.springframework.stereotype.Service;

@Service
public class OmdbService {

    private final String PATH = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";

    private ConverteDados conversor = new ConverteDados();
    private ConsumoApi consumo = new ConsumoApi();


    public DadosSerie buscarDados(String titulo) {

        String uri = PATH + titulo + API_KEY;
        var json = consumo.obterDados(uri);

        DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
        return dadosSerie;


    }
}
