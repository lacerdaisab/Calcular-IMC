public class Pessoa {

    /* declara de variáveis */
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String sexo;
    double imc;

    /* mostra os dados */
    void mostrarDados () {
        System.out.printf("%s, %s, %s, %s, %s", this.nome, this.idade, this.altura, this.peso, this.sexo);
    }

    public Pessoa(String nome, int idade, double altura, int peso, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    /* método que modifica os atributos */
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setIdade (Integer idade) {
        this.idade = idade;
    }
    public void setAltura (double altura) {
        this.altura = altura;
    }
    public void setPeso (double peso) {
        this.peso = peso;
    }
    public void setSexo (String sexo) {
        this.sexo = sexo;
    }

    /* método que acessa os atributos */
    public String getNome () {
        return nome;
    }
    public int getIdade () {
        return idade;
    }
    public double getAltura () {
        return altura;
    }
    public double getPeso () {
        return peso;
    }
    public String getSexo () {
        return sexo;
    }

    /* faz o calculo do imc */
    public void calcula () {
        imc = peso / (altura*altura);
        System.out.println("\n" + imc);
    }

    /* mostra a categoria */
    public void informa () {
        if (imc < 18.5){
            System.out.println("\nAbaixo do peso normal.");
        } else if (imc >= 18.5 && imc <= 25) {
            System.out.println("\nPeso Normal.");
        } else if (imc>= 25 && imc <= 30) {
            System.out.println("\nAcima do peso normal.");
        } else {
            System.out.print("\nObsesidade.");
        }
    } 
}
