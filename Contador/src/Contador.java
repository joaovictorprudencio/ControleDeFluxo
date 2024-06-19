
import java.util.Scanner;
public class Contador {
    public static void main(String[] args)  {
       Scanner dados = new Scanner(System.in); 
       System.out.println("digite o primeiro numero");
       int numero1 = dados.nextInt();
       System.out.println("digite o segundo numero");
       int numero2 = dados.nextInt();
       
        try {
        contar(numero1, numero2);

        } catch (Excecao e) {
            System.out.println(e.getMessage()); 
        }
    }

   public  static void contar(int n1 ,int  n2) throws Excecao  {
        if(n1>n2){
           throw new Excecao("numero 1 não pode ser maior que o numero 2");
        }
       int contar = n2 - n1 ;


      for (int index = 1; index <= contar; index++) {
          System.out.println("numero:" + index );
      }
           
   }
}






