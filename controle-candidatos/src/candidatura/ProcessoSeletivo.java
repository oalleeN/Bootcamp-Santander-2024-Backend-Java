package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "PAULO"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas<3);
        
        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MÁXIMO TENTIVAS " + tentativasRealizadas + " REALIZADA");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "PAULO"};
        System.out.println("IMPRIMINDO LISTA DE CANDIDATOS SELECIONADOS: ");
        for (int i=0 ; i<candidatos.length ; i++) {
            System.out.println("O candidato " + candidatos[i] + " de Nª" + (i+1) + " foi selecionado para a vaga!");
        }
        for (String candidato : candidatos) {
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "PAULO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecioados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecioados < 5 && candidatosAtuais < candidatos.length) {
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + String.format("%.2f", salarioPretendido));

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatosSelecioados++;
            }
            candidatosAtuais++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCanditato(double salarioPretedido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretedido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretedido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTRA");
        } else {
            System.out.println("AGURADANDO RESULTADO DEMAIS CADIDATOS");
        }
    }
}
