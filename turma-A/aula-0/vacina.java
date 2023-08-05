import java.util.Scanner;
public class vacina {
    
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas genes vocé quer analizar?");
        int q = entrada.nextInt();

         int genes[] = new int[q];

         for(int i=0; i<q;i++){

            genes[i] =entrada.nextInt();

         }
 
 
 
 
    }
}