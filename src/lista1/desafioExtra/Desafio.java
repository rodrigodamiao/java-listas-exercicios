package lista1.desafioExtra;

import java.util.ArrayList;
import java.util.List;

public class Desafio {

    public static List<Paciente> gerarPacientes() {
        List<Paciente> pacientes = new ArrayList<>();

        pacientes.add(new Paciente("João Silva", 34, "M", 1.80, 85.0));
        pacientes.add(new Paciente("Maria Souza", 22, "F", 1.65, 72.5));
        pacientes.add(new Paciente("Carlos Oliveira", 27, "M", 1.75, 78.0));
        pacientes.add(new Paciente("Ana Lima", 19, "F", 1.68, 69.0));
        pacientes.add(new Paciente("Lucas Pereira", 45, "M", 1.82, 90.0));
        pacientes.add(new Paciente("Fernanda Alves", 24, "F", 1.62, 74.3));
        pacientes.add(new Paciente("Bruno Costa", 18, "M", 1.70, 68.2));
        pacientes.add(new Paciente("Juliana Martins", 30, "F", 1.58, 60.0));
        pacientes.add(new Paciente("Ricardo Ramos", 52, "M", 1.76, 82.7));
        pacientes.add(new Paciente("Aline Ferreira", 21, "F", 1.66, 71.1));

        return pacientes;
    }

    public static void dadosPacientes(List<Paciente> pacientes){
        int quantidadeDePacientes = pacientes.size();
        int quantidadeDePacientesEntre18E25 = 0;
        double mediaIdadeHomens = 0;
        int mulheresAltura160a170Peso70Mais = 0;
        String nomeHomemMaisVelho = "";
        String nomeMulherMaisBaixa = "";

        int homens = 0;
        int idade = 0;
        double somaIdadeHomens = 0;
        double altura = 500000000.0d;

        for(Paciente paciente : pacientes){
            if(paciente.getIdade() >= 18 && paciente.getIdade() <= 25) quantidadeDePacientesEntre18E25++;

            if(paciente.getSexo().equals("M")){
                homens++;
                somaIdadeHomens += paciente.getIdade();
            }

            if((paciente.getSexo().equals("F")) &&
                    (paciente.getAltura() >= 1.60 && paciente.getAltura() <= 1.70) &&
                            (paciente.getPeso() > 70)) mulheresAltura160a170Peso70Mais++;

            if(paciente.getSexo().equals("M") && paciente.getIdade() > idade){
                idade = paciente.getIdade();
                nomeHomemMaisVelho = paciente.getNome();
            }

            if(paciente.getSexo().equals("F") && paciente.getAltura() < altura){
                altura = paciente.getAltura();
                nomeMulherMaisBaixa = paciente.getNome();
            }
        }

        mediaIdadeHomens = somaIdadeHomens / homens;

        System.out.println("Resultado dos dados dos pacientes:");
        System.out.println("A quantidade de pacientes: "+ quantidadeDePacientes);
        System.out.println("A quantidade de pacientes com idade entre 18 e 25: " + quantidadeDePacientesEntre18E25);
        System.out.println("A média de idade dos homens: " + mediaIdadeHomens);
        System.out.println("A quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + mulheresAltura160a170Peso70Mais);
        System.out.println("O nome do paciente homem mais velho: " + nomeHomemMaisVelho);
        System.out.println("O nome da mulher mais baixa: " + nomeMulherMaisBaixa);
    }

    public static void main(String[] args) {
        gerarPacientes().stream().forEach(System.out::println);

        System.out.println();

        dadosPacientes(gerarPacientes());
    }
}
