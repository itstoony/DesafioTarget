package com.github.itstoony;

public class Desafio4 {

    public static void main(String[] args) {
        calcularDistancia();
    }

    public static void calcularDistancia() {

        /*
          Para resolver este problema, podemos seguir os seguintes passos:
          1- Calcular a distância entre os veículos no momento em que se encontram na rodovia.
          2- Calcular a distância que cada veículo percorreu até o ponto de encontro.
          3- Comparar as distâncias percorridas por cada veículo e determinar qual está mais próximo da cidade de Ribeirão Preto.
         */

        double distancia = 100.0; // km
        double velocidadeCarro = 110.0; // km/h
        double velocidadeCaminhao = 80.0; // km/h
        double tempoViagem = distancia / (velocidadeCarro + velocidadeCaminhao); // h

        // Distância percorrida pelo carro quando se encontram
        double distanciaCarro = velocidadeCarro * tempoViagem;

        // Distância percorrida pelo caminhão quando se encontram
        double distanciaCaminhao = distancia - distanciaCarro;

        // Tempo que o caminhão leva para passar pelos dois pedágios
        double tempoPedagio = 2 * 5.0 / 60.0; // h

        // Distância percorrida pelo caminhão enquanto passa pelos dois pedágios
        double distanciaPedagio = velocidadeCaminhao * tempoPedagio;

        // Distância que falta para o caminhão chegar em Ribeirão Preto após passar pelos pedágios
        double distanciaFalta = distanciaCaminhao - distanciaPedagio;

        // Distância total percorrida pelo caminhão desde Franca até chegar em Ribeirão Preto
        double distanciaTotal = distancia + distanciaPedagio + distanciaFalta;

        /*
         O caminhão leva 5 minutos a mais para passar em cada um dos dois pedágios, então devemos adicionar o tempo gasto nos pedágios à distância percorrida pelo caminhão. Multiplicamos o tempo pelos pedágios por 2, já que ele precisa passar por eles duas vezes, uma na ida e outra na volta.
         Por fim, podemos comparar as distâncias percorridas por cada veículo e determinar qual está mais próximo da cidade de Ribeirão Preto:
         */
        String mensagem = distanciaCarro < distanciaTotal ? "O carro estará mais próximo de Ribeirão Preto." :
                distanciaCarro > distanciaTotal ? "O caminhão estará mais próximo de Ribeirão Preto." :
                        "O carro e o caminhão estarão na mesma distância de Ribeirão Preto.";

        System.out.println(mensagem);
    }

}
