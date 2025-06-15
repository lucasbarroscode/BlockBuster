package br.com.lucascode.blockbuster.blockbuster.service.api;

import br.com.lucascode.blockbuster.blockbuster.model.DadosSerie;
import br.com.lucascode.blockbuster.blockbuster.service.api.utils.ConverteDados;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
