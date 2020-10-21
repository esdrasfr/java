import java.util.Scanner;

public class Exercicio2c{
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

    // processsamento --> calcular area = (base * altura)/2

    area = (base * altura)/2;

    //saida -> exibe o valor calculado da area do triangulo
    System.out.println("Valor da area ="+area);
    }
}