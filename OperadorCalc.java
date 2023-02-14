import java.util.Scanner;

public class OperadorCalc {
    public static void main(String[] Felipe) {
        Scanner entrada = new Scanner(System.in);
       
        int numero1;
        int numero2;
        int soma;
        int sub;
        int mult;
        int div;
        double rest;
        
        System.out.println("Digite um número");
        numero1=entrada.nextInt();

        System.out.println("Digite um número");
        numero2=entrada.nextInt();
        soma=numero1+numero2;
        System.out.println("A soma dos dois numeros é: " + soma);

        System.out.println("Digite um número");
        numero1=entrada.nextInt();

        System.out.println("Digite um número");
        numero2=entrada.nextInt();
        sub=numero1-numero2;
        System.out.println("A subtração dos dois numeros é: " + sub);

        System.out.println("Digite um número");
        numero1=entrada.nextInt();

        System.out.println("Digite um número");
        numero2=entrada.nextInt();
        mult=numero1*numero2;
        System.out.println("A multiplicação dos dois numeros é: " + mult);

         System.out.println("Digite um número");
        numero1=entrada.nextInt();

        System.out.println("Digite um número");
        numero2=entrada.nextInt();
        div=numero1/numero2;
        System.out.println("A divisão dos dois numeros é: " + div);

         System.out.println("Digite um número");
        numero1=entrada.nextInt();

        System.out.println("Digite um número");
        numero2=entrada.nextInt();
        rest=numero1%numero2;
        System.out.println("O resto dos dois numeros é: " + rest);

       
   }
}