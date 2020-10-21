import java.util.Scanner;

public class Uri1043{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    float a,b,c,res,area;

    a = teclado.nextFloat();
    b = teclado.nextFloat();
    c = teclado.nextFloat();
    
    // Calculo para saber se é um triangulo: A+B>C AND B+C > A AND A+C > B

        if ( a + b > c && b + c > a && a + c > b){
            res = (a + b + c);
            System.out.printf("Perimetro = %.1f\n", + res);  
                        }
    // caso contrario calcular area do trapezio
        else {   
            area = ( ((a + b ) * c) / 2 );
            System.out.printf("Area = %.1f\n", + area);
        }

        
        


    }
}