package br.com.lucascode.blockbuster.blockbuster.service.api;

import br.com.lucascode.blockbuster.blockbuster.model.DadosSerie;
import br.com.lucascode.blockbuster.blockbuster.service.api.utils.ConverteDados;

public class Omdb {

    private final String PATH = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";

    private ConverteDados conversor = new ConverteDados();
    private ConsumoApi consumo = new ConsumoApi();

    public void requestOmdb(){
        
        var nameSerie = "supernatural";
        var json = consumo.obterDados(PATH + nameSerie.replace(" ", "+") + API_KEY);

        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(json);


        

    }


}
