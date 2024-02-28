import java.util.Scanner;
public class ex9 {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            boolean usuarioAlfabetizado = true;

            System.out.println("informe seu nome: ");
            String nomeUsuario = teclado.next();
            teclado.next();
            System.out.println("informe sua idade: ");
            int idadeUsuario = teclado.nextInt();

            System.out.println("Voce e alfabetizado? responda com (SIM) ou (NAO) ");
            String alfabetizado = teclado.next();
            if(alfabetizado.equalsIgnoreCase("sim")){
                usuarioAlfabetizado = true;
            } else if (alfabetizado.equalsIgnoreCase("nao")) {
               usuarioAlfabetizado = false;
            }

            if(idadeUsuario >= 18 && idadeUsuario <= 70 && usuarioAlfabetizado){
                System.out.println("VOTO OBRIGATORIO!!!");
            } else if (idadeUsuario >= 18 && idadeUsuario <= 70 && !usuarioAlfabetizado) {
                System.out.println("VOTO OPCIONAL!!!");

            }
            if (idadeUsuario >= 16 && idadeUsuario<= 17 || idadeUsuario > 70){
                System.out.println("VOTO OPCIONAL!!!");
            }

            if(idadeUsuario < 16){
                System.out.println("VOTO INVALIDO/PROIBIDO!!!");
            }
        }
}
