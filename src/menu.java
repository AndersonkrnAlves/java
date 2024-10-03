
import java.util.Scanner;



public class menu {
    
    public static void main(String[] args) {
        
        System.out.println("Digite um dos comandos abaixo do menu: ");
        System.out.println("1: Comprar; 2: Vender; 3:Listar; 4: Sair");
        
        try (//le do teclado um caracter
        Scanner scan = new Scanner(System.in)) {
            int opcao = scan.nextInt();
             switch (opcao) {
                case 1:
                    System.out.println("Você acessou COMPRAR");
                    break;
                case 2:
                    System.out.println("Você acessou VENDER");
                    break;

                case 3:
                    System.out.println("Você acessou LISTAR");
                    break;

                default:
                    System.out.println("Saindo do Sistema");
                    break;
             }
        }
        
    } 

}
