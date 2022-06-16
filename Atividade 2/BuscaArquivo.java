import java.util.Arrays;

public class BuscaArquivo {

    public static void main(String[] args) {

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