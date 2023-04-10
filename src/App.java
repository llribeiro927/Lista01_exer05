import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
       // Faça um Programa que converta metros para centímetros.
       double metros;
       double centimetros; 
       // Entrada de Dados 
       System.out.println("Informe um valor em metros ");
       Scanner teclado = new Scanner(System.in); 
       metros = teclado.nextDouble(); 
       
       centimetros = metros * 100; 
       // Saída de Dados 
       System.out.println("O valor em centimetros é: " + centimetros);
       teclado.close(); 

    }
}
