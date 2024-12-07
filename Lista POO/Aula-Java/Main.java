public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-90", 50);

        System.out.println("Nome da empresa: " + empresa.getNome());
        System.out.println("CNPJ: " + empresa.getCNPJ());
        System.out.println("Número de funcionários: " + empresa.getNumeroFuncionarios());

        empresa.contratar(10);
        empresa.demitir(5);
        empresa.demitir(60);
    }
}
