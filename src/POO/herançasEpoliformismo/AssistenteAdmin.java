package POO.herançasEpoliformismo;

public class AssistenteAdmin extends Funcionario{
    @Override
    void exibeDados() {
        System.out.println(nome);
        System.out.println(numMatricula);
    }
}
