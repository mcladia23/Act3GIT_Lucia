import java.util.Random;

public class App {
    
        public static void main(String[] args) { 
            mostrarNumerosAleatorios(); } 
            public static void mostrarNumerosAleatorios() { 
                Random rand = new Random(); 
                for (int i = 0; i < 20; i++) { 
                    int numeroAleatorio = rand.nextInt(10) + 1; 
                    System.out.println(numeroAleatorio); 
                } 
            }  
}
