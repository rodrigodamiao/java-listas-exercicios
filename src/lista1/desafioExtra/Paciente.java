package lista1.desafioExtra;

public class Paciente {
    private int idade;
    private String sexo;
    private double altura;
    private double peso;
    private String nome;

    public Paciente(String nome, int idade, String sexo, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", nome='" + nome + '\'' +
                '}';
    }
}
