package DOJO_Java_SE.medio.encapsulamento;

public class Usuario {

    private String nome;
    private String enail;
    private String senha;

    public Usuario(String nome, String enail, String senha) {
        this.nome = nome;
        this.enail = enail;
        this.senha = senha;
    }

    public void alterarSenha(String novaSenha){
        if(novaSenha.length() >= 8 && containsNumber(novaSenha)){
            senha = novaSenha;
        }
        else{
            throw new IllegalArgumentException("A senha deve ter pelo menos 8 caracteres e conter ao menos um número.");
        }
    }

    public boolean containsNumber(String senha){
        for(Character c : senha.toCharArray()){
            if(Character.isDigit(c)) return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnail() {
        return enail;
    }

    public void setEnail(String enail) {
        this.enail = enail;
    }

    public String getSenha() {
        return senha;
    }
}
