package POO.herançasEpoliformismo;

public class AssistenteTec extends Funcionario{
    @Override
    void exibeDados() {
        System.out.println(nome);
        System.out.println(numMatricula);
    }
}
