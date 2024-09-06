import java.util.Scanner;

public class Exercises {
    public static void ex1() {
        Scanner sc = new Scanner(System.in);

        Livro livro = new Livro();

        System.out.println("Digite o autor do livro: ");
        livro.autor = sc.nextLine();
        System.out.println("Digite o título do livro: ");
        livro.titulo = sc.nextLine();
        System.out.println("Digite o número de paginas do livro: ");
        livro.numPaginas = sc.nextInt();

        System.out.println(livro.toString());

    }

    public static void ex2() {
        Scanner sc = new Scanner(System.in);

        Celular celular = new Celular();

        System.out.println("Digite a marca do celular: ");
        celular.marca = sc.nextLine();
        System.out.println("Digite a modelo do celular: ");
        celular.modelo = sc.nextLine();
        System.out.println("Digite a capacidade da bateria do celular: ");
        celular.capacidadeBateria = sc.nextFloat();

        System.out.println(celular.toString());

    }

    public static void ex3() {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.println("Digite o nome da pessoa: ");
        pessoa.nome = sc.nextLine();
        System.out.println("Digite a idade da pessoa: ");
        pessoa.idade = sc.nextInt();
        System.out.println("Digite a altura da pessoa: ");
        pessoa.altura = sc.nextFloat();

        System.out.println(pessoa.toString());

        pessoa.apresentacaoPessoa(pessoa);

    }

    public static void ex4() {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        System.out.println("Insira o número da conta: ");
        conta.numeroConta = sc.nextInt();
        System.out.println("Insira o saldo da conta: ");
        conta.saldo = sc.nextFloat();

        System.out.println(conta.toString());

        boolean continuar = true;

        while (continuar) {
            System.out.println("1 - Depositar dinheiro");
            System.out.println("2 - Sacar dinheiro");
            System.out.println("Insira a opção desejada:");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o valor do depósito: ");
                    float valorDeposito = sc.nextFloat();
                    conta.depositarDinheiro(valorDeposito);
                    break;
                case 2:
                    System.out.println("Insira o valor do saque: ");
                    float valorSaque = sc.nextFloat();
                    conta.sacarDinheiro(valorSaque);
                    break;
                default:
                    System.out.println("Insira uma opção válida!");
            }

            System.out.println("Deseja continuar? (1 = Sim / 2 = Não): ");
            int opcaoMenu = sc.nextInt();
            continuar = opcaoMenu == 1;
        }


    }

    public static void ex5() {
        Scanner sc = new Scanner(System.in);

        Cachorro cachorro = new Cachorro();

        System.out.println("Insira nome do cachorro");
        cachorro.nome = sc.nextLine();
        System.out.println("Insira a raça do cachorro: ");
        cachorro.raca = sc.nextLine();
        System.out.println("Insira a idade do cachorro: ");
        cachorro.idade = sc.nextInt();

        System.out.println("Deseja que o cachorro realize alguma ação?(1 = s/2 = n): ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            boolean continuar = true;

            while (continuar) {

                int opcaoMenu = sc.nextInt();

                System.out.printf("Ações do cachorro: ");
                System.out.printf("1 - Latir");
                System.out.printf("2 - Correr");

                switch (opcaoMenu) {
                    case 1:
                        cachorro.latir();
                        break;
                    case 2:
                        cachorro.correr();
                        break;
                }
                System.out.println("Realizar outra ação? (1 = s/2 = n): ");
                int opcaoContinuar = sc.nextInt();
                if (opcaoContinuar == 1) {
                    continuar = true;
                } else if (opcaoContinuar == 2) {
                    continuar = false;
                }
            }
        }
    }


    public static void ex6() {
        Computador computador = new Computador("I5", "HyperX", "SSD", false);

        System.out.println(computador);
        computador.conferirStatus();
        computador.ligar();
        computador.conferirStatus();
        computador.desligar();
        computador.conferirStatus();

        computador.setProcessador("I3");
        System.out.println(computador.getProcessador());

        System.out.println(computador.toString());
    }

    public static void ex7() {
        Aluno aluno = new Aluno("João", 11111111, "Matemática");

        int vetorNotas [] = {2, 4, 6, 8};

        System.out.println(aluno);
        aluno.mediaNotas(vetorNotas);
        aluno.setCurso("Português");
        System.out.println(aluno.toString());
    }

    public static void ex8() {
        Professor professor = new Professor("José", "Geografia", 5000);
        System.out.println(professor);
        professor.darAula(professor.getDisciplina());
        professor.corrigirProvas(professor.getDisciplina());
        professor.setSalario(5800);
        System.out.println(professor);
        professor.setDisciplina("Matemática e Geografia");
        professor.setSalario(8500);
        System.out.println(professor.toString());
    }

    public static void ex9() {
        Produtos produtos = new Produtos("Arroz", 15, 100);

        System.out.println(produtos);
        produtos.setNome("Feijão");
        System.out.println(produtos.getNome());
        produtos.setPreco(10);
        System.out.println(produtos.getPreco());
        produtos.setQuantidadeEstoque(50);
        System.out.println(produtos.getQuantidadeEstoque());
        produtos.diminuirEstoque(produtos.getQuantidadeEstoque());
        System.out.println(produtos.getQuantidadeEstoque());
        produtos.aumentarEstoque(produtos.getQuantidadeEstoque());
        System.out.println(produtos.getQuantidadeEstoque());

        System.out.println(produtos);
    }

    public static void ex10() {
        Veiculo veiculo = new Veiculo("Carro", 1234567, "Fiat");

        System.out.println(veiculo);
        veiculo.setMarca("BMW");
        System.out.println(veiculo.getMarca());
        veiculo.setPlaca(1245984);
        System.out.println(veiculo.getPlaca());
        System.out.println(veiculo.toString());
        veiculo.abastecer();
        veiculo.lavar();
    }

    public static void ex11() {
        Cidade cidade = new Cidade("Toledo", 150000, "Paraná");

        System.out.println(cidade);
        cidade.aumentarPopulacao(cidade.getPopulacao());
        System.out.println(cidade.getPopulacao());
        System.out.println(cidade.toString());
        cidade.diminuirPopulacao(cidade.getPopulacao());
        System.out.println(cidade.getPopulacao());
        System.out.println(cidade.toString());
    }

    public static void ex12() {
        Filme filme = new Filme("Frozen", "Alguém", 90);

        System.out.println(filme);
        filme.setTitulo("Narnia");
        System.out.println(filme.getTitulo());
        filme.setDiretor("Fulano");
        System.out.println(filme.getDiretor());
        filme.setDuracao(120);
        System.out.println(filme.getDuracao());
        System.out.println(filme.toString());
        filme.iniciarFilme();
        filme.pararFilme(filme.getDuracao());
    }

    public static void ex13() {
        Time time = new Time("Flamengo", "Tite", 25);

        System.out.println(time);
        time.adicionarJogadores(time.getNumDeJogadores());
        System.out.println(time.getNumDeJogadores());
        time.removerJogadores(time.getNumDeJogadores());
        System.out.println(time.getNumDeJogadores());
        System.out.println(time.toString());

        System.out.println(time);
    }

    public static void ex14() {
        Jogo jogo = new Jogo("PES", "Arcade", 200);
        System.out.println(jogo);
        jogo.setPreco(250);
        System.out.println(jogo.getPreco());
        System.out.println(jogo);
        jogo.iniciarJogo();
        jogo.pausarJogo();

        System.out.println(jogo);
    }

    public static void ex15() {
        Loja loja = new Loja("Nike", "USA", "99999999");

        System.out.println(loja);
        loja.setEndereco("Canada");
        System.out.println(loja.getEndereco());
        System.out.println(loja);
        loja.abrirLoja(loja.getNome());
        loja.fecharLoja(loja.getNome());


        System.out.println(loja);
    }

    public static void ex16() {
        Animal animal = new Animal("Cachorro", 11, 30);
        animal.alimentar();
        animal.dormir();

        System.out.println(animal.toString());
    }

    public static void ex17() {
        LivroDigital livroDigital = new LivroDigital("Narnia", "Joao", 800);
        livroDigital.abrirLivro();
        livroDigital.fecharLivro();

        System.out.println(livroDigital);
    }

    public static void ex18() {
        Bicicleta bicicleta = new Bicicleta("Yamaha", "1500", 26);
        bicicleta.pedalar();
        bicicleta.frear();

        System.out.println(bicicleta);
    }

    public static void ex19() {
        Cozinha cozinha = new Cozinha("Domiciliar", 4, "Branca");
        cozinha.cozinhar();
        cozinha.limpar();

        System.out.println(cozinha);
    }

    public static void ex20() {
        Empresa empresa = new Empresa("Sadia", 123456, 100);
        empresa.contratar();
        empresa.demitir();

        System.out.println(empresa);
    }
}

