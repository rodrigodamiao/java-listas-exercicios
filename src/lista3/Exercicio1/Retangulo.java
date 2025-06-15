package lista3.Exercicio1;

public class Retangulo {

    private float comprimento;
    private float largura;

    public float calcularArea(){
        return comprimento * largura;
    }

    public float calcularPerimetro(){
        return (comprimento + largura) * 2;
    }

    public Retangulo(float comprimento, float largura) {
        setComprimento(comprimento);
        setLargura(largura);
    }

    public static void main(String[] args) {
        try {
            Retangulo retangulo = new Retangulo(10.5f, 8.3f);
            System.out.printf("Área: %.2f\n", retangulo.calcularArea());
            System.out.printf("Perímetro: %.2f\n", retangulo.calcularPerimetro());

            Retangulo retangulo2 = new Retangulo(30f, 40f);
            System.out.printf("Área: %.2f\n", retangulo2.calcularArea());
            System.out.printf("Perímetro: %.2f\n", retangulo2.calcularPerimetro());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        if(comprimento > 0 && comprimento < 20) this.comprimento = comprimento;
        else {
            throw new IllegalArgumentException("O comprimento deve estar entre 0 e 20");
        }
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        if(largura > 0 && largura < 20) this.largura = largura;
        else {
            throw new IllegalArgumentException("A largura deve estar entre 0 e 20");
        }
    }
}
