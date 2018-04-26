public class Pessoa implements Comparable {

    private String nome;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int compareTo(Object o) {
        Pessoa other = (Pessoa) o;

        if (getIdade() < other.getIdade()) {
            return 1;
        } else if (getIdade() > other.getIdade()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Pessoa) {
            return ((Pessoa) o).idade == this.idade;
        } else if (o != null) {
            //Parse no valor inteiro para Integer
            return new Integer(this.idade).equals(o);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
