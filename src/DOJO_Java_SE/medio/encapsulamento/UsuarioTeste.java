package DOJO_Java_SE.medio.encapsulamento;

public class UsuarioTeste {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Usuario", "email@email.com", "123");
        System.out.println("Senha atual: " + usuario.getSenha());

        try {
            usuario.alterarSenha("12345"); // Inválida: < 8 caracteres
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao alterar senha: " + e.getMessage());
        }

        System.out.println("Senha final: " + usuario.getSenha()); // Verifica se mudou
    }
}

