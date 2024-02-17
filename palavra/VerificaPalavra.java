package palavra;

public class VerificaPalavra {
    public static String gerapalavra(String palavra) {
        if (palavra.length() >= 8) {
            char[] c = { palavra.charAt(0), palavra.charAt(1), palavra.charAt(palavra.length() - 2),
                    palavra.charAt(palavra.length() - 1) };
            String palavra2 = new String(c);
            return palavra2;
        } else {
            return "mensagem erro";
        }

    }
}
