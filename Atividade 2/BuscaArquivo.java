import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BuscaArquivo extends JFrame {
    private static JLabel BuscaSequencial01 = new JLabel("Tempo da Busca Sequencial no vetor de Dez: 0 Milisegundos");
    private static JLabel BuscaBinaria01 = new JLabel("Tempo da Busca Binaria no vetor de Dez: 0 Milisegundos");
    private static JLabel BuscaSequencial02 = new JLabel("Tempo da Busca Sequencial no vetor de Dez: 0 Milisegundos");
    private static JLabel BuscaBinaria02 = new JLabel("Tempo da Busca Binaria no vetor de Dez: 0 Milisegundos");
    private static JLabel BuscaSequencial03 = new JLabel("Tempo da Busca Sequencial no vetor de Dez: 0 Milisegundos");
    private static JLabel BuscaBinaria03 = new JLabel("Tempo da Busca Binaria no vetor de Dez: 0 Milisegundos");
    private static JLabel BuscaSequencial04 = new JLabel("Tempo da Busca Sequencial no vetor de Dez: 7 Milisegundos");
    private static JLabel BuscaBinaria04 = new JLabel("Tempo da Busca Binaria no vetor de Dez: 0 Milisegundos");
    private static JLabel BuscaSequencial05 = new JLabel("Tempo da Busca Sequencial no vetor de Dez: 200 Milisegundos");
    private static JLabel BuscaBinaria05 = new JLabel("Tempo da Busca Binaria no vetor de Dez: 41 Milisegundos");

    public static void main(String[] args) {
        BuscaArquivo window = new BuscaArquivo();
        window.setSize(500, 500);
        window.setVisible(true);
        window.setTitle("Estrutura de Dados");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new FlowLayout());
        window.getContentPane().add(BuscaSequencial01);
        window.getContentPane().add(BuscaBinaria01);
        window.getContentPane().add(BuscaSequencial02);
        window.getContentPane().add(BuscaBinaria02);
        window.getContentPane().add(BuscaSequencial03);
        window.getContentPane().add(BuscaBinaria03);
        window.getContentPane().add(BuscaSequencial04);
        window.getContentPane().add(BuscaBinaria04);
        window.getContentPane().add(BuscaSequencial05);
        window.getContentPane().add(BuscaBinaria05);

        window.setLayout(new GridLayout(10, 2));
<<<<<<< HEAD
        window.getContentPane().setBackground(new Color(100, 129, 200));
=======
        window.getContentPane().setBackground(new Color(150, 200, 200));
>>>>>>> f21c0fe67d33b02776133b164bb68588061389b0
        // long start = System.currentTimeMillis();
        int vetorDez[], vetorCem[], vetorMil[], vetorDezMil[], vetorCemMil[];
        int chave = 15;
        vetorDez = new int[10];
        vetorCem = new int[100];
        vetorMil = new int[1000];
        vetorDezMil = new int[10000];
        vetorCemMil = new int[1000000];

        menu();
        System.out.println("====== Vetor de Dez Posicoes ======");
        vetorDeDez(vetorDez, chave);
        System.out.println("\n");
        System.out.println("====== Vetor de Cem Posicoes ======");
        vetorDeCem(vetorCem, chave);
        System.out.println("\n");
        System.out.println("====== Vetor de Mil Posicoes ======");
        vetorDeMil(vetorMil, chave);
        System.out.println("\n");
        System.out.println("====== Vetor de Dez Mil Posicoes ======");
        vetorDeDezMil(vetorDezMil, chave);
        System.out.println("\n");
        System.out.println("====== Vetor de Cem Mil Posicoes ======");
        vetorDeCemMil(vetorCemMil, chave);

    }

    private void setBackground(String string) {
    }

    private void setForeground(String string) {
    }

    public static long vetorDeDez(int[] valor, int chave) {
        for (int i = 0; i < valor.length; i++) {
            valor[i] = (int) Math.round(Math.random() * 1000);
        }
        long start = System.currentTimeMillis();
        Arrays.sort(valor);

        // Busca Sequencial

        for (int i = 0; i < valor.length; i++) {
            if (valor[i] == chave) {
                System.out.println("Chave encontrada");
            }

        }

        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Tempo da Busca Sequencial no vetor de Dez: " + elapsed + " Milisegundos");

        int inicio = 0;
        int fim = valor.length - 1;
        int meio;

        long init = System.currentTimeMillis();

        Arrays.sort(valor);

        // Busca Binaria

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (valor[meio] < chave) {
                inicio = meio + 1;
            } else if (valor[meio] > chave) {
                fim = meio - 1;
            } else {
                long end = System.currentTimeMillis() - init;
                System.out.println("Tempo da Busca Binaria no vetor de Cem Mil: " + end + " Milisegundos");
                return meio;
            }

        }

        long end = System.currentTimeMillis() - init;
        System.out.println("Tempo da Busca Binaria no vetor de Dez: " + end + " Milisegundos");
        return 0;
    }

    public static int vetorDeCem(int[] valor, int chave) {
        for (int i = 0; i < valor.length; i++) {
            valor[i] = (int) Math.round(Math.random() * 100000);
        }
        long start = System.currentTimeMillis();
        Arrays.sort(valor);

        // Busca Sequencial

        for (int i = 0; i < valor.length; i++) {
            if (valor[i] == chave) {
                System.out.println("Chave encontrada");
            }

        }

        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Tempo da Busca Sequencial no vetor de Cem: " + elapsed + " Milisegundos");

        int inicio = 0;
        int fim = valor.length - 1;
        int meio;

        long init = System.currentTimeMillis();
        Arrays.sort(valor);

        // Busca Binaria

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (valor[meio] < chave) {
                inicio = meio + 1;
            } else if (valor[meio] > chave) {
                fim = meio - 1;
            } else {
                long end = System.currentTimeMillis() - init;
                System.out.println("Tempo da Busca Binaria no vetor de Cem Mil: " + end + " Milisegundos");
                return meio;
            }
        }

        long end = System.currentTimeMillis() - init;
        System.out.println("Tempo da Busca Binaria no vetor de Cem: " + end + " Milisegundos");
        return 0;

    }

    public static int vetorDeMil(int[] valor, int chave) {
        for (int i = 0; i < valor.length; i++) {
            valor[i] = (int) Math.round(Math.random() * 100000);
        }
        long start = System.currentTimeMillis();
        Arrays.sort(valor);

        // Busca Sequencial

        for (int i = 0; i < valor.length; i++) {
            if (valor[i] == chave) {
                System.out.println("Chave encontrada");
            }

        }

        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Tempo da Busca Sequencial no vetor de Mil: " + elapsed + " Milisegundos");

        int inicio = 0;
        int fim = valor.length - 1;
        int meio;

        long init = System.currentTimeMillis();
        Arrays.sort(valor);

        // Busca Binaria

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (valor[meio] < chave) {
                inicio = meio + 1;
            } else if (valor[meio] > chave) {
                fim = meio - 1;
            } else {
                long end = System.currentTimeMillis() - init;
                System.out.println("Tempo da Busca Binaria no vetor de Cem Mil: " + end + " Milisegundos");
                return meio;
            }
        }

        long end = System.currentTimeMillis() - init;
        System.out.println("Tempo da Busca Binaria no vetor de Mil: " + end + " Milisegundos");
        return 0;
    }

    public static int vetorDeDezMil(int[] valor, int chave) {
        for (int i = 0; i < valor.length; i++) {
            valor[i] = (int) Math.round(Math.random() * 100000);
        }
        long start = System.currentTimeMillis();
        Arrays.sort(valor);

        // Busca Sequencial

        for (int i = 0; i < valor.length; i++) {
            if (valor[i] == chave) {
                System.out.println("Chave encontrada");
            }

        }

        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Tempo da Busca Sequencial no vetor de Dez Mil: " + elapsed + " Milisegundos");

        int inicio = 0;
        int fim = valor.length - 1;
        int meio;

        long init = System.currentTimeMillis();
        Arrays.sort(valor);

        // Busca Binaria

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (valor[meio] < chave) {
                inicio = meio + 1;
            } else if (valor[meio] > chave) {
                fim = meio - 1;
            } else {
                long end = System.currentTimeMillis() - init;
                System.out.println("Tempo da Busca Binaria no vetor de Cem Mil: " + end + " Milisegundos");
                return meio;
            }
        }

        long end = System.currentTimeMillis() - init;
        System.out.println("Tempo da Busca Binaria no vetor de Dez Mil: " + end + " Milisegundos");
        return 0;

    }

    public static int vetorDeCemMil(int[] valor, int chave) {
        for (int i = 0; i < valor.length; i++) {
            valor[i] = (int) Math.round(Math.random() * 100000);
        }
        long start = System.currentTimeMillis();
        Arrays.sort(valor);

        // Busca Sequencial

        for (int i = 0; i < valor.length; i++) {
            if (valor[i] == chave) {
                // System.out.println("A Chave foi encontrada!!");
            }

        }

        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Tempo da Busca Sequencial no vetor de Cem Mil: " + elapsed + " Milisegundos");

        int inicio = 0;
        int fim = valor.length - 1;
        int meio;

        long init = System.currentTimeMillis();
        Arrays.sort(valor);

        // Busca Binaria

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (valor[meio] < chave) {
                inicio = meio + 1;
            } else if (valor[meio] > chave) {
                fim = meio - 1;
            } else {
                long end = System.currentTimeMillis() - init;
                System.out.println("Tempo da Busca Binaria no vetor de Cem Mil: " + end + " Milisegundos");
                return meio;
            }
        }

        return 0;
    }

    public static void menu() {
        System.out.println("------ Visualizador de Metodos de Buscas ------");
        System.out.println("-------------------      ----------------------");
    }

}