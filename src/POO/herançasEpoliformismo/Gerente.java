package POO.herançasEpoliformismo;

public class Gerente extends Funcionario{
    char setor;

    public char getSetor() {
        return setor;
    }

    @Override
    void exibeDados() {
        System.out.println(nome);
        System.out.println(numMatricula);
        System.out.println(setor);
    }
}
