public class esquema {
    
    public static void main(String[] args){

        int v[];

        v = new int[5];

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) Math.round(Math.random() * 1000);
        }

        int n = v.length;

        for(int j = 1; j < n; j++){
            int key = v[j];
            int i = j - 1;
            while ((i > -1) && (v[i] < key)) {
                v[i + 1] = v[i];
                i--;
            }
            v[i + 1] = key;
        }
        
        
        System.out.print("Valores Ordenados de Forma Decrescente: ");

        for (int i = 0; i < v.length; i++) {
            System.out.print("( " + v[i] + " )");
        }

        System.out.println("");
    }
}
