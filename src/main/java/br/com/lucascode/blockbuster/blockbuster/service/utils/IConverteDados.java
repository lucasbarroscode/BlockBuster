package br.com.lucascode.blockbuster.blockbuster.service.utils;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
