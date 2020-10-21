import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
    Scanner teclado;
    teclado = new Scanner(System.in);

    int numfunc,horastrab;
    double valorhora,salario;

    numfunc = teclado.nextInt();
    horastrab = teclado.nextInt();
    valorhora = teclado.nextDouble();
    
    salario = (horastrab * valorhora);


    System.out.println("NUMBER = " + numfunc);

    System.out.printf("SALARY = U$ %.2f\n", salario);


    }




}
