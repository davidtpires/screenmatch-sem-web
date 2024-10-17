package br.com.alura.screammatch.principal;

import br.com.alura.screammatch.service.ConsumoApi;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=4f942238";

    public void exibeMenu() {
        System.out.println("Digite o nome da série para buscar:");
        var nomeSerie = leitura.nextLine();;
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ","&") + API_KEY);
    }
}
