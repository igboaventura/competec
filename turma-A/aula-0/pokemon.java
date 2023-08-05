import java.util.Scanner;

public class pokemon{
   
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Quantos pokémons seráo aquivados:");
        int taman = entrada.nextInt();
        String n[] = new String[taman];
        
        int i = 0;

       for(i=0 ; i < taman +1 ; i++){

        System.out.println("Os nomes deles são:");
         n[taman] = entrada.next();

    }
  }

}