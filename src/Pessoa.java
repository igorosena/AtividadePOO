public class Pessoa {
    public String nome;
    public float dataNascimento;
    public int idade;
    public Pessoa(String nome,float dataNascimento,int idade){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public String setNome(String nome){
       return this.nome = nome;
    }

    public float getDataNascimento(){
        return dataNascimento;
    }
    public float setDataNascimento(float dataNascimento){
        return this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
