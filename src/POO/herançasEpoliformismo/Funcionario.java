package POO.herançasEpoliformismo;

abstract class Funcionario {
    int numMatricula;
    char nome;

    public int getNumMatricula() {
        return numMatricula;
    }

    abstract void exibeDados();

}

