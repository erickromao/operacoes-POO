package ordenacao.pessoa;

public class ExecPessoas {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Erick", 21, 1.80);
        ordenacaoPessoas.adicionarPessoa("Carol", 20, 1.5);
        ordenacaoPessoas.adicionarPessoa("Daniel", 24, 1.6);
        ordenacaoPessoas.adicionarPessoa("Teixeira", 22, 1.85);

        ordenacaoPessoas.mostrarTodos();
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
