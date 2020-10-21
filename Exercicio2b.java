import java.util.Scanner;

public class Exercicio2b{
    public static void main(String args[]){
    Scanner teclado;
    teclado = new Scanner(System.in);

    float area, base, altura;

    // entrada -> pedir para o usuario informar o valor da base

    System.out.println("Por favor, informe a base");
    base = teclado.nextFloat();

    // entrada -> pedir para o usuario informar o valor da altura

    System.out.println("Por favor, informe a altura");
    altura = teclado.nextFloat();

    // processsamento --> calcular area = base * altura

    area = base * altura;

    //saida -> exibe o valor calculado da areas
    System.out.println("Valor da area ="+area);
    }
}