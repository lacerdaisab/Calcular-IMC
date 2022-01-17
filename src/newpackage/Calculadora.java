package newpackage;
import java.util.Scanner;
public class Calculadora {
    public static void main(String args[]){
        String nome;
        Float idade;
        double altura;
        double peso;
        String sexo;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome=teclado.nextLine();
         System.out.println("Digite o sexo da pessoa");
        sexo=teclado.nextLine();
        System.out.println("Digite a idade da pessoa");
        idade=teclado.nextFloat();
        System.out.println("Digite a altura da pessoa");
        altura=teclado.nextDouble();
        System.out.println("Digite o peso da pessoa");
        peso=teclado.nextDouble();
       
        
        
        System.out.println("A pessoa:"+nome);
        System.out.println("idade="+idade);
        System.out.println("altura="+altura);
         System.out.println("peso="+peso);
          System.out.println("sexo:"+sexo);
        double imc;
        imc = peso / (altura*altura);
        
        if(imc <18.5){
            System.out.println("Abaixo do peso normal");
        }else if(imc>= 18.5 && imc <= 25){
            System.out.println("Peso Normal");
        }else if(imc>= 25 && imc <= 30){
           System.out.println("Acima do peso normal");
    }

    }
}