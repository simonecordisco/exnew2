public class Main {

    public static void main(String[] args) {
        char carattere = '5';
        verificaSeNumero(carattere);
        System.out.println("Il carattere è un numero.");

        char carattereNonNumero = 'A';
        verificaSeNumero(carattereNonNumero);
        System.out.println("Il carattere è un numero.");
    }

    public static void verificaSeNumero(char carattere) throws IllegalArgumentException {
        if (!Character.isDigit(carattere)) {
            throw new IllegalArgumentException("Il carattere non è un numero.");
        }
    }
}