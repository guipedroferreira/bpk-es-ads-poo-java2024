import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sentinela = 0;

        while (sentinela == 0) {
            System.out.println("Insira qual exercício deseja verificar:\n");

            int option = sc.nextInt();

            System.out.println("Exercício Inserido: " + option);

            switch (option) {
                case 1:
                    Exercises.ex1();
                    break;
                case 2:
                    Exercises.ex2();
                    break;
                case 3:
                    Exercises.ex3();
                    break;
                case 4:
                    Exercises.ex4();
                    break;
                case 5:
                    Exercises.ex5();
                    break;
                case 6:
                    Exercises.ex6();
                    break;
                case 7:
                    Exercises.ex7();
                    break;
                case 8:
                    Exercises.ex8();
                    break;
                case 9:
                    Exercises.ex9();
                    break;
                case 10:
                    Exercises.ex10();
                    break;
                case 11:
                    Exercises.ex11();
                    break;
                case 12:
                    Exercises.ex12();
                    break;
                case 13:
                    Exercises.ex13();
                    break;
                case 14:
                    Exercises.ex14();
                    break;
                case 15:
                    Exercises.ex15();
                    break;
                case 16:
                    Exercises.ex16();
                    break;
                case 17:
                    Exercises.ex17();
                    break;
                case 18:
                    Exercises.ex18();
                    break;
                case 19:
                    Exercises.ex19();
                    break;
                case 20:
                    Exercises.ex20();
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

            System.out.println("Continuar e verificar outro exercício? (S = 0/N = 1)");
            sentinela = sc.nextInt();
        }

        sc.close();

    }
}