public class TraductorMorse {

    public static void main(String[] args) {
        String textoParaTraducir = "ABCD"; 
        Morse m = new Morse();

        try {
            String textoTraducido = m.traducir(textoParaTraducir);
           
        } catch (ClaveNoEncontradaError e) {
            System.err.println("Error al traducir: " + e.getMessage());
        }
    }
}