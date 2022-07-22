package ExercicioPropostoList1;

import java.util.*;

public class TemperaturaMedia {
    public static void main(String[] args) {
        List<Temperatura> tempMedia = new ArrayList<>(){{
            add(new Temperatura("jan", 1, 20.6d));
            add(new Temperatura("fev", 2, 21.9d));
            add(new Temperatura("mar", 3, 22.7d));
            add(new Temperatura("abr", 4, 23.5d));
            add(new Temperatura("mai", 5, 21.0d));
            add(new Temperatura("jun", 6, 24.5d));


        }};
        System.out.println(tempMedia);

        System.out.println("Média da temperatura semestral: ");
        Iterator<Temperatura> iterator = tempMedia.listIterator();
        Double soma = 0d;

        while(iterator.hasNext()){
            Double next = iterator.next().getTemp();
            //System.out.println(next);
            soma += next;
        }

        System.out.println((soma/6) + "ºC");

    }
}

//Iniciando a classe Temperatura, que tera as informações recebidas na ArrayList - tempMedia
class Temperatura {
    private String mes;
    private Integer numMes;
    private Double temp;

    //Construtor
    public Temperatura(String mes, Integer numMes, Double temp) {
        this.mes = mes;
        this.numMes = numMes;
        this.temp = temp;
    }

    //Getter, pois foi utilizado o tipo private na definicao das variaveis/parametros
    public String getMes() {
        return mes;
    }

    public Integer getNumMes() {
        return numMes;
    }

    public Double getTemp() {
        return temp;
    }

    //Sobrescrevendo dentro da classe Temperatura para toString, caso contrario o resultado sera a localizacao na memoria e nao a informacao
    //que queremos visualizar, ou seja, mes-numMes-temp

    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", numMes=" + numMes +
                ", temp=" + temp +
                '}';
    }
}