package construtor;
public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "362.758.948-30");
        marcos.setEndereco("RUA LITUANIA, 245");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf() + " mora na " + marcos.getEndereco());
    }
}
