import java.util.Scanner;

public class SistemaDeLogin {
    public static void main (String[] args) {
    // Nome de usuário e senha válidos
    String usuarioValido = "usuario";
    String senhaValida = "senha123";

    Scanner scanner = new Scanner(System.in);

    boolean loginSucesso = false;

    while (!loginSucesso) {
        System.out.println("Nome de usuário: ");
        String usuarioDigitado = scanner.nextLine();

        System.out.println("Senha: ");
        String senhaDigitada = scanner.nextLine();

        if (usuarioDigitado.equals(usuarioValido) && senhaDigitada.equals(senhaValida)) {
        loginSucesso = true;
            System.out.println("Login bem-sucedido! Bem-vindo " + usuarioDigitado + ".");
        } else {
            System.out.println("Nome de usuário ou senha incorretos. Tente Novemante.");
            }
        }
    
        scanner.close();
    }
}
