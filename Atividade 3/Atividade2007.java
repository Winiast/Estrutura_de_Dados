import java.util.Scanner;

public class Atividade2007 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opcao = 0;
        int valorPilha = 0;
        int vetor[] = new int[10];
        int i = 0;

        while (opcao != 5) {
            System.out.println(menu());
            System.out.println("Digite sua opção: > ");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor: ");
                    valorPilha = scan.nextInt();
                    empilhar(valorPilha, vetor, i);
                    i++;

                    break;
                case 2:
                    desempilhar(vetor, i - 1);
                    i--;
                    break;
                case 3:
                    System.out.println("Digite o valor buscado: ");
                    int busca = scan.nextInt();
                    if (buscar(busca, vetor) != 0) {
                        System.out.println("O valor buscado está na posição do index: " + buscar(busca, vetor));
                        break;
                    } else {
                        System.out.println("Valor não encontrado no vetor");
                        break;
                    }

                case 4:
                    mostrarPilha(vetor);
                    break;
                case 5:
                    System.out.println("Saindo ...");
                    break;
            }
        }

    }

    public static void desempilhar(int vetor[], int i) {
        vetor[i] = 0;

    }

    public static void empilhar(int valor, int vetor[], int i) {
        vetor[i] = valor;
    }

    public static int buscar(int valorBuscado, int vetor[]) {
        int index;
        for (int y = 0; y < vetor.length; y++) {
            if (vetor[y] == valorBuscado) {
                index = y;
                return index;
            }
        }
        return 0;
    }

    public static void mostrarPilha(int vetor[]) {

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] != 0) {
                System.out.print(" (" + vetor[j] + ") ");
            }

        }

    }

    public static String menu() {
        String str = "";
        str += "\n------------------------";
        str += "\n ( 1 ) Empilhar ";
        str += "\n ( 2 ) Desempilhar";
        str += "\n ( 3 ) Buscar Valor";
        str += "\n ( 4 ) Mostrar Pilha";
        str += "\n ( 5 ) Sair";
        str += "\n------------------------";
        return str;
    }
}