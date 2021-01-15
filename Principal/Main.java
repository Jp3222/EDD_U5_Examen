
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;

public class EDD {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\HP\\Desktop\\Mi_Archivo.txt");
            //La ruta esta programada para buscar un archivo en el escritorio
            //Los numeros deben estar separados por un espacio.
            BufferedReader bf = new BufferedReader(fr);
            String numeros = bf.readLine();
            String arreglo[] = numeros.split(" ");
            int M[] = Integer(arreglo);
            System.out.println("Arreglo original\n" + Arrays.toString(M));
            Burbuja(M);
            System.out.println("Arreglo ordenado\n" + Arrays.toString(M));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EDD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int[] Integer(String M[]) {
        int I[] = new int[M.length];
        for (int i = 0; i < M.length; i++) {
            I[i] = Integer.parseInt(M[i]);
        }
        return I;
    }

    public static void Burbuja(int M[]) {
        for (int i = 0; i < M.length - 1; i++) {
            for (int j = 0; j < M.length - 1; j++) {
                if (M[j] > M[j + 1]) {
                    int aux = M[j];
                    M[j] = M[j + 1];
                    M[j + 1] = aux;
                }
            }
        }
    }

}
