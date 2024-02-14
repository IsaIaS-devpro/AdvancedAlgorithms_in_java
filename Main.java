import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n ========== QUESTÕES DE ALGORITMOS EM JAVA ========== \n");
            System.out.println(" 01.    SOMA DE DUAS VARIÁVEIS...");
            System.out.println("\n 02. 	Área do Círculo");
            System.out.println("\n 03. SEGUNDOS PARA HORA:MINUTOS:SEGUNDOS");
            System.out.println("\n 04. LANCHES");
            System.out.println("\n 05. POKEMON: DABRIEL, GUARTE E EMPATE");
            System.out.println("\n 06.  SALTOS ONRNAMENTAIS");
            System.out.println("\n 07. Turistas no Parque Huacachina");
            System.out.println("\n 08. 	Jogando Dardos Por Distância");
            System.out.println("\n 09. 	...... S A I R ......");
            System.out.print("\n Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Questao questaoSoma = new Questao();
                    questaoSoma.executar();
                    break;
              case 2:  
                    Questao questaoArea = new Questao();
                    questaoArea.executar2();
                    break;
              case 3:
                    Questao questaoSegundos = new Questao();
                    questaoSegundos.executar3();
                    break;
              case 4: 
                    Questao questaoLanches = new Questao();
                    questaoLanches.executar4();
                    break;
              case 5:
                    Questao pokemon = new Questao();  
                    pokemon.executar5();
                    break;  
              case 6:
                    Questao saltos = new Questao();
                    saltos.executar6();
                    break;
              case 7:
                    Questao turistas = new Questao();
                    turistas.executar7();
                    break;
               
                case 8:  
                    Questao questaoDardos = new Questao();
                    questaoDardos.executar8();
                    break;
                case 9:  
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("\n Opção inválida! Tente novamente.");
            }
        } while (opcao != 9);

        scanner.close();
    }
}
