package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {
            "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "João"
        };
        System.out.println("Processo seletivo!");

        anlisarCandidato(1900.0);
        anlisarCandidato(2200.0);
        anlisarCandidato(2000.0);

        selecaoCandidatos(candidatos);
        
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }

        imprimirSelecionados(candidatos);
    }

    static void entrandoEmContato(String candidato) {
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando)
                tentativaRealizadas++;
            else
                System.out.println("Contato realizado sucesso!!");
        }while(continuarTentando && tentativaRealizadas < 3);

        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativaRealizadas + " tentativas");
        else
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas " + tentativaRealizadas+ " realizada");
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1 ;
    }

    static void selecaoCandidatos(String [] candidatos){
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = salarioPretendidoRandomico();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
        }
    }

    static void imprimirSelecionados(String [] candidatos){
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n° " + (indice + 1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static double salarioPretendidoRandomico() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void anlisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else {
            System.out.println("Aguardando o resultado dos demais candidato");
        }
    }


}
