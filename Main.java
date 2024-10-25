import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double x = sc.nextDouble();
      
    while (x != 2002){
      System.out.println("Senha Invalida");
      x = sc.nextDouble();
    }
    
    System.out.println("Acesso Permitido");
  
      sc.close();
    }
}
