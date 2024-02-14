import java.util.Scanner;
import java.util.Arrays;

public class Questao {
    private int valorA;
    private int valorB;

    public void executar() {
        lerValores();
        int resultado = somar();
        exibirResultado(resultado);
    }

    private void lerValores() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Digite o valor de A: ");
        valorA = scanner.nextInt();
        System.out.print(" Digite o valor de B: ");
        valorB = scanner.nextInt();
    }

    private int somar() {
        return valorA + valorB;
    }

    private void exibirResultado(int resultado) {
        System.out.println("\n A soma de A e B é: " + resultado);
    }

  public void executar2(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira o raio do círculo:");
    double raio = scanner.nextDouble();
    double area = Math.PI * Math.pow(raio, 2);
    System.out.println("A área do círculo é: " + area);
  }

public void executar3(){
  Scanner scanner = new Scanner(System.in);
  System.out.println("Insira a duração do evento em segundos:");
  int segundos = scanner.nextInt();

  int horas = segundos / 3600;
  segundos %= 3600;
  int minutos = segundos / 60;
  segundos %= 60;

  System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
}
  public void executar4(){

    String[] lanches = {"Cachorro Quente", "X-Salada", "X-Bacon", "Torrada Simples", "Refrigerante"};
        double[] precos = {4.00, 4.50, 5.00, 2.00, 1.50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lista de Lanches:");
        for (int i = 0; i < lanches.length; i++) {
            System.out.printf("%d = %s = R$ %.2f\n", i+1, lanches[i], precos[i]);
        }
        System.out.println("Insira o código do item:");
        int codigo = scanner.nextInt();
        System.out.println("Insira a quantidade deste item:");
        int quantidade = scanner.nextInt();

        double total = precos[codigo - 1] * quantidade;
        System.out.printf("O valor da conta a pagar é: R$ %.2f\n", total);
    }

  public void executar5(){
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    for (int i = 0; i < T; i++) {
        int B = scanner.nextInt();
        int[] golpe = new int[2];
        String[] treinadores = {"Dabriel", "Guarte"};
        for (int j = 0; j < 2; j++) {
            System.out.println("Jogando: " + treinadores[j]);
            int A = scanner.nextInt();
            System.out.println("Ataque: " + A);
            int D = scanner.nextInt();
            System.out.println("Defesa: " + D);
            int L = scanner.nextInt();
            System.out.println("Level: " + L);
            golpe[j] = ((A + D) / 2) + (L % 2 == 0 ? B : 0);
            System.out.println("Valor do golpe: " + golpe[j]);
        }
        if (golpe[0] > golpe[1]) {
            System.out.println("Vencedor: Dabriel");
        } else if (golpe[0] < golpe[1]) {
            System.out.println("Vencedor: Guarte");
        } else {
            System.out.println("Empate");
        }
    }
        }

     public void executar6(){
       Scanner scanner = new Scanner(System.in);
           System.out.println("Digite o número de saltadores:");
           int N = scanner.nextInt();
           for (int i = 0; i < N; i++) {
               System.out.println("Digite o nome do saltador:");
               String nome = scanner.next();
               System.out.println("Digite o grau de dificuldade do salto:");
               double GD = scanner.nextDouble();
               double[] notas = new double[7];
               for (int j = 0; j < 7; j++) {
                   System.out.println("Digite a nota " + (j+1) + ":");
                   notas[j] = scanner.nextDouble();
               }
               Arrays.sort(notas);
               double soma = 0;
               for (int j = 1; j < 6; j++) {
                   soma += notas[j];
               }
               double resultado = soma * GD;
               System.out.printf("O resultado final para %s é %.2f\n", nome, resultado);
           }
       }


    public void executar7(){
      Scanner scanner = new Scanner(System.in);
          int totalTuristas = 0;
          int totalJipes = 0;

          while (true) {
              System.out.println("Digite 'SALIDA' se o jipe está saindo ou 'VUELTA' se está retornando. Digite 'ABEND' para encerrar:");
              String comando = scanner.next();

              if (comando.equals("ABEND")) {
                  break;
              }

              System.out.println("Digite a quantidade de turistas que o jipe está transportando:");
              int turistas = scanner.nextInt();

              if (comando.equals("SALIDA")) {
                  totalTuristas += turistas;
                  totalJipes++;
              } else if (comando.equals("VUELTA")) {
                  totalTuristas -= turistas;
                  totalJipes--;
              }
          }

          System.out.println("A quantidade de turistas que ainda faltam voltar do parque é: " + totalTuristas);
          System.out.println("A quantidade de jipes que ainda faltam voltar do parque é: " + totalJipes);
      }

public void  executar8(){
     Scanner scanner = new Scanner(System.in);
      System.out.println("Digite o número de casos de teste:");
      int N = scanner.nextInt();
      for (int i = 0; i < N; i++) {
          int pontuacaoJoao = 0;
          int pontuacaoMaria = 0;
          System.out.println("Caso de teste " + (i+1) + ":");
          System.out.println("Arremessos de João:");
          for (int j = 0; j < 3; j++) {
              System.out.println("Digite a pontuação e a distância do arremesso " + (j+1) + ":");
              int X = scanner.nextInt();
              int D = scanner.nextInt();
              pontuacaoJoao += X * D;
          }
          System.out.println("Arremessos de Maria:");
          for (int j = 0; j < 3; j++) {
              System.out.println("Digite a pontuação e a distância do arremesso " + (j+1) + ":");
              int X = scanner.nextInt();
              int D = scanner.nextInt();
              pontuacaoMaria += X * D;
          }
          if (pontuacaoJoao > pontuacaoMaria) {
              System.out.println("\n VENCEDOR:.....JOAO");
          } else {
              System.out.println("\n VECEDORA: ....MARIA");
          }
      }
  }
  
    }
  
    



