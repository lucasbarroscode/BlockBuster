package br.com.lucascode.blockbuster.blockbuster.service.api.utils;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
