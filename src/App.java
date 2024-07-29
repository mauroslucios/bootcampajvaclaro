public class App {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Mauro";
        String segundoNome = "Pereira";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
