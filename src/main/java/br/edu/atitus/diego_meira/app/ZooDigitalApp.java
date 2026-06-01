package br.edu.atitus.diego_meira.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.diego_meira.animais.*;
import br.edu.atitus.diego_meira.comportamentos.Corrida;
import br.edu.atitus.diego_meira.comportamentos.Nado;
import br.edu.atitus.diego_meira.comportamentos.Predacao;
import br.edu.atitus.diego_meira.comportamentos.Voo;
import br.edu.atitus.diego_meira.especies.Animal;

public class ZooDigitalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Animal> animais = new ArrayList<>();

        int opcao;

        do {

            IO.println("\n========== ZOO DIGITAL ==========");
            IO.println("1 - Cadastrar Animal");
            IO.println("2 - Listar Todos os Animais");
            IO.println("3 - Listar Animais Corredores");
            IO.println("4 - Listar Animais Nadadores");
            IO.println("5 - Listar Animais Voadores");
            IO.println("6 - Listar Animais Predadores");
            IO.println("7 - Exibir Total de Animais");
            IO.println("0 - Sair");

            IO.print("Digite uma opção: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {

                    case 1 -> cadastrarAnimal(animais, sc);

                    case 2 -> listarTodos(animais);

                    case 3 -> listarCorredores(animais);

                    case 4 -> listarNadadores(animais);

                    case 5 -> listarVoadores(animais);

                    case 6 -> listarPredadores(animais);

                    case 7 -> exibirTotalAnimais();

                    case 0 -> IO.println("FLW");

                    default -> IO.println("Opção inválida.");
                }

            } catch (Exception e) {
                IO.println("Erro: " + e.getMessage());
                opcao = -1;
            }

        } while (opcao != 0);

        sc.close();
    }

    private static void cadastrarAnimal(List<Animal> animais, Scanner sc) {

        IO.println("\n===== CADASTRAR ANIMAL =====");

        IO.println("1 - Avestruz");
        IO.println("2 - Cachorro");
        IO.println("3 - Cobra");
        IO.println("4 - Corvo");
        IO.println("5 - Gambá");
        IO.println("6 - Gato");
        IO.println("7 - Golfinho");
        IO.println("8 - Iguana");
        IO.println("9 - Jacaré");
        IO.println("10 - Pato");
        IO.println("11 - Peixe-Lua");
        IO.println("12 - Peixe-Morcego");
        IO.println("13 - Pinguim");
        IO.println("14 - Pirarucu");
        IO.println("15 - Tartaruga");
        IO.println("16 - Traíra");

        IO.print("Escolha o animal: ");
        int tipo = Integer.parseInt(sc.nextLine());

        IO.print("Nome: ");
        String nome = sc.nextLine();

        IO.print("Idade: ");
        int idade = Integer.parseInt(sc.nextLine());

        Animal animal = null;

        switch (tipo) {

            case 1 -> animal = new Avestruz(nome, idade, "Marrom");

            case 2 -> animal = new Cachorro(nome, idade);

            case 3 -> animal = new Cobra(nome, idade);

            case 4 -> animal = new Corvo(nome, idade, "Preto");

            case 5 -> animal = new Gamba(nome, idade);

            case 6 -> animal = new Gato(nome, idade);

            case 7 -> animal = new Golfinho(nome, idade);

            case 8 -> animal = new Iguana(nome, idade);

            case 9 -> animal = new Jacare(nome, idade);

            case 10 -> animal = new Pato(nome, idade, "Branco");

            case 11 -> animal = new PeixeLua(nome, idade);

            case 12 -> animal = new PeixeMorcego(nome, idade);

            case 13 -> animal = new Pinguim(nome, idade, "Preto e Branco");

            case 14 -> animal = new Pirarucu(nome, idade);

            case 15 -> animal = new Tartaruga(nome, idade);

            case 16 -> animal = new Traira(nome, idade);

            default -> {
                IO.println("Animal inválido.");
                return;
            }
        }

        animais.add(animal); // Upcasting

        IO.println("Animal cadastrado com sucesso!");
    }

    private static void listarTodos(List<Animal> animais) {

        if (animais.isEmpty()) {
            IO.println("Nenhum animal cadastrado.");
            return;
        }

        IO.println("\n===== TODOS OS ANIMAIS =====");

        for (Animal animal : animais) {

            exibirAnimal(animal);

            animal.emitirSom(); // Polimorfismo
            animal.comer();     // Polimorfismo
        }
    }

    private static void listarCorredores(List<Animal> animais) {

        IO.println("\n===== ANIMAIS CORREDORES =====");

        for (Animal animal : animais) {

            if (animal instanceof Corrida corredor) {

                exibirAnimal(animal);

                corredor.correr();
            }
        }
    }

    private static void listarNadadores(List<Animal> animais) {

        IO.println("\n===== ANIMAIS NADADORES =====");

        for (Animal animal : animais) {

            if (animal instanceof Nado nadador) {

                exibirAnimal(animal);

                nadador.nadar();
            }
        }
    }

    private static void listarVoadores(List<Animal> animais) {

        IO.println("\n===== ANIMAIS VOADORES =====");

        for (Animal animal : animais) {

            if (animal instanceof Voo voador) {

                exibirAnimal(animal);

                voador.voar();
            }
        }
    }

    private static void listarPredadores(List<Animal> animais) {

        IO.println("\n===== ANIMAIS PREDADORES =====");

        for (Animal animal : animais) {

            if (animal instanceof Predacao predador) {

                exibirAnimal(animal);

                predador.cacar();
            }
        }
    }

    private static void exibirTotalAnimais() {

        IO.println("\n===== TOTAL DE ANIMAIS =====");
        IO.println("Quantidade de animais cadastrados: " + Animal.getContador());
    }

    private static void exibirAnimal(Animal animal) {

        IO.println("--------------------------------");
        IO.println("Nome: " + animal.getNome());
        IO.println("Idade: " + animal.getIdade());
        IO.println("Espécie: " + animal.getEspecie());
    }
}