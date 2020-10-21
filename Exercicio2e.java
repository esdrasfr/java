import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
    Scanner teclado;
    teclado = new Scanner(System.in);

    float area, baseMaior, baseMenor, altura;

    // entrada -> pedir para o usuario informar o valor da base maior

    System.out.println("Por favor, informe a base maior");
    baseMaior = teclado.nextFloat();


    // entrada -> pedir para o usuario informar o valor da base menor

    System.out.println("Por favor, informe a base menor");
    baseMenor = teclado.nextFloat();

    // entrada -> pedir para o usuario informar o valor da altura

    System.out.println("Por favor, informe a altura");
    altura = teclado.nextFloat();

    // processsamento --> calcular area =  (base maior + base menor)* altura /2

    area = (baseMaior + baseMenor) * altura / 2;

    //saida -> exibe o valor calculado da area do trapezio
    System.out.println("Valor da area é %.3f/n"+ area);
    System.out.printf("Valor da area é %.4f", area);
    }
}