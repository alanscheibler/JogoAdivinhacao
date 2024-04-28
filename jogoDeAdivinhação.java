import java.util.Scanner;
import java.util.Random;

public class jogoDeAdivinhação {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        Random random = new Random();
        int numero = random.nextInt(100) +1;
        int tentativa = 5;
        
        while (tentativa > 0) {
          
            System.out.println("sorteio: "+numero);
            System.out.println("tentativas: "+tentativa);
            System.out.println("Digite seu palpite");
            int palpite = lerTeclado.nextInt();
            
            
            int distancia = Math.abs(palpite - numero);
            String temperatura = "";

            if (distancia > 20) {
                temperatura = "frio";
            } else if (distancia >5 && distancia < 20){
                temperatura = "morno";
            } else  if (distancia > 0 && distancia < 6){
                temperatura = "quente";
            }

            if (palpite==numero){
                System.out.println("Parabéns você acertou o número era: "+palpite);
                tentativa = -1;
            }else {
                switch (temperatura) {
                    case "frio":
                        System.out.println("Você não acertou, seu palpite foi frio.");
                        tentativa --;
                        break;
                    
                    case "morno":
                        System.out.println("Você não acertou, seu palpite foi morno");
                        tentativa --;
                        break;
                    
                    case "quente":
                        System.out.println("Você não acertou, seu palpite foi quente");
                        tentativa --;
                        break;

                    default:
                        break;
                }
                System.out.println("Você ainda tem " + tentativa + " chances de acertar:");
                System.out.println("aperte enter para continuar");
                lerTeclado.nextLine();
                lerTeclado.nextLine();
                limparTela.cls();
            }
            if (tentativa == 0){
                System.err.println("Suas chances acabaram, o número sorteado era: " + numero);
            }
            
            }
            lerTeclado.close();
}
}
    
    
