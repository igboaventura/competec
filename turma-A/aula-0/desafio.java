import java.util.Scanner;
public class desafio {
    public static void main(String[] args) {

        int ddd;
        
        Scanner  entrada = new Scanner(System.in);
       
       System.out.println("Digite um DDD");
        ddd = entrada.nextInt();

        if(ddd==11){
            System.out.println("Este DDD é de São Paulo, PÔ MANOOO!!!");

        }
        else if(ddd==21){
            System.out.println("Este DDD é do Rio de janeiro, pegou a visão mermão?");
        }
        else if(ddd==71|| ddd==73||  ddd==74||  ddd==75||  ddd==77){
            System.out.println("Este DDD é da Bahia, BOM DIA MEU REI!!!!!");
        }
         else{
            System.out.println("Digite um DDD certo aí irmão!!!!!!");
        }

    }
}