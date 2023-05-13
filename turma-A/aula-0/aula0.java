import java.util.Scanner;
 public class aula0{
     
    public static void main(String[] args) {
//         System.out.println("exercicio0");
        
        
//         String nome = "igor alves";
//         int idade = 16;
//         boolean cafeDaManha = true;
//         char inicial= 'i';
       
//       System.out.println(inicial+": idade = "+idade+ " Tomou café " + cafeDaManha );
    
            // int n1 = 10;
            // int n2 = 2;
            // int resultado= n1 % n2;
    
            // System.out.println(resultado);

            // double laranja = 5.50;
            // double uva = 2.96;
            // double resultado = laranja + uva;

            // System.out.println("preço total= "+resultado);
             // System.out.print("preço total= "+resultado);
                   // System.out.printf("preço total= "+resultado);
            

                //    Scanner entrada = new Scanner(System.in);
                //     System.out.println("Qual número vc deseja salvar?");
                //     int numero =entrada.nextInt();

                //     System.out.println("O número que foi digitado foi: " + numero);




                //    entrada.close();


        //         Scanner entrada = new Scanner(System.in);
        //         System.out.println("Qual seu nome?");
        //         String numero =entrada.nextLine();

        //         System.out.println("bom dia: " + numero);




        //        entrada.close();
        // }


        System.out.println("-------------------------------");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome =entrada.nextLine();
        System.out.println("-------------------------------");

        
        System.out.println("-------------------------------");
        System.out.println("Qual seu sobrenome?");
        String sobrenome =entrada.nextLine();
        System.out.println("-------------------------------");

        
        System.out.println("-------------------------------");
        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();
        System.out.println("-------------------------------");

       
        System.out.println("Bom dia ," + nome + " "+sobrenome + " e sua idade é "  + idade);

       




       entrada.close();
}
}