import java.util.ArrayList;
import java.util.Arrays;

public class burble {
    
    public static void main(String[] args){
        
        int v[];

        v = new int[5];

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) Math.round(Math.random() * 1000);
        }

        for(int i = v.length; i >= 1; i--){
            for(int j = 1; j < i; j++){
                if(v[j -1 ] < v[j]){
                    int aux = v[j];
                    v[j] = v[j -1];
                    v[j - 1] = aux;
                }
            }
        }

        System.out.print("Valor ordenado: ");

        for (int i = 0; i < v.length; i++) {
            if(i == 0){
                System.out.print(" " + v[i]);
            }else{
                System.out.print("-" + v[i]);
            }
            
        }

        System.out.println("");
    }
}
