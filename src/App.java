import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import modelo.Motorista;
import modelo.Passageiro;
import modelo.Viagem;

public class App {
    public static void main(String[] args) throws Exception {
        // formatação da data
        DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // construindo a lista de viagens
        List<Viagem> listaViagens = obterDados();

        // construindo o MAP de viagens por data
        Map<LocalDate, List<Viagem>> viagensDataMap = 
                        listaViagens.stream().collect(Collectors.groupingBy(Viagem::getData));

        // imprimindo as viagens por data
        viagensDataMap.entrySet().forEach(
            item -> System.out.printf("Dia %s : Viagens : %s \n",
                                        item.getKey().format(dataformatada), item.getValue())
        );

        System.out.println("------------------------------------------------------------");

        // construindo MAP de valores médios de viagens por dia
        Map<LocalDate, Double> valoresMedios = 
                        listaViagens.stream()
                        .collect(Collectors.groupingBy(
                            Viagem::getData , 
                            Collectors.averagingDouble(Viagem::getValor)));

        valoresMedios.entrySet().forEach(
            x -> System.out.printf("Data : %s - Valor médio das corridas: %.2f \n",
                                    x.getKey().format(dataformatada), x.getValue())
        );
    }

    private static List<Viagem> obterDados(){
        List<Viagem> listaViagens = new ArrayList<>();

        listaViagens.add(new Viagem(LocalDate.parse("2021-10-18"), 
                        new Motorista("joão", "1111", 55), 
                        new Passageiro("Gustavo", "2222"), 
                        23.55
        ));

        listaViagens.add(new Viagem(LocalDate.parse("2021-10-18"), 
                        new Motorista("Maria", "3333", 36), 
                        new Passageiro("Joana", "4444"), 
                        55.69
        ));

        listaViagens.add(new Viagem(LocalDate.parse("2021-10-15"), 
                        new Motorista("Gabriela", "5555", 25), 
                        new Passageiro("Rodrigo", "6666"), 
                        69.63
        ));

        listaViagens.add(new Viagem(LocalDate.parse("2021-10-15"), 
                        new Motorista("Michel", "7777", 19), 
                        new Passageiro("Marcus", "8888"), 
                        12
        ));

        listaViagens.add(new Viagem(LocalDate.now(), 
                        new Motorista("Jessica", "9999", 32), 
                        new Passageiro("Jose", "9885"), 
                        100
        ));


        listaViagens.add(new Viagem(LocalDate.now(), 
                        new Motorista("Livia", "1565", 23), 
                        new Passageiro("Luiz", "5656"), 
                        56
        ));

        return listaViagens;
    }
}
