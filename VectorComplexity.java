import java.util.Scanner;
public class VectorComplexity {
    public static void main(String[] args) {
        //vetor
        int[] vector = new int[10];
        int valor = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe " + vector.length + " Valores separados por um espaco: \n");

        for (int indx=0; indx < vector.length; indx++)
        {
            //System.out.printf("\nvector[%d] = %d", indx, vector[indx]);
            vector[indx] = keyboard.nextInt();
        }

        System.out.println("\nInforme o valor a ser pesquisado: ");
        valor = keyboard.nextInt();

        for(int indx=0; indx < vector.length; indx++)
        {
            if (vector[indx] == valor)
            {
            System.out.printf("\nvector[%d] = %d", indx, vector[indx]);
            break;
            }
        }
    }
}
