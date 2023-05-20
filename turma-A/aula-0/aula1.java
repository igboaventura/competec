import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class aula1 {
    public static void main(String[] args) {

        // double abacaxi = 7.30;
        // double maca = 2.0;
        // double pera = 3.0;

        // Scanner entrada = new Scanner(System.in);
        // System.out.println("Digite quantos Abacaxis voce deseja: ");
        // abacaxi *= entrada.nextInt();
        // System.out.println("Digite quantos maças você deseja: ");
        // maca *= entrada.nextInt();
        // System.out.println("Digite quanta peras você deseja: ");
        // pera *= entrada.nextInt();

        // System.out.println("preço total R$ = "+ (abacaxi + maca + pera) );

        // Scanner entrada = new Scanner(System.in);
        // int x,y;

        // System.out.println("Digite seu primeiro valor");
        // x = entrada.nextInt();
        // System.out.println("Digite seu segundo valor");
        // y = entrada.nextInt();

        // if(x == y){
        // System.out.println("Valor igual");
        // }
        // else {

        // System.out.println("Valor DIFERENTE");

        // }

        Scanner entrada = new Scanner(System.in);

        boolean chuva;
        boolean nublado;
        boolean sol;

        System.out.println("Está chovendo? [sim/não] ");
        chuva = entrada.nextBoolean();

        System.out.println("Está nublado?  [sim/não] ");
        nublado = entrada.nextBoolean();

        System.out.println("Está ensolarado?  [sim/não] ");
        sol = entrada.nextBoolean();

        if (nublado == true) {

            System.out.println("Está nublado");

        } else if (chuva == true) {

            System.out.println("Está chovendo");
        } else if( sol == true){
            System.out.println("Está ensolarado");
        
        }
        else{
            System.out.println("tá um dia normal");
        }
        // Scanner entrada = new Scanner(System.in);

        // String op;

        // System.out.println("Digite U ou T");
        // op= entrada.nextLine();

        // if(op=="U"){
        //     System.out.println("DOWN");
        // }
        
        // else{
        //     System.out.println("tall");
        // }

    }
}
