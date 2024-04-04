    import java.util.HashMap;
    import java.util.Map;

    public class Morse {
        private static final Map<Character, String> morseMap = new HashMap<>();

        
        Morse()
        {
            inicializarMorse();
        }
        public void inicializarMorse() {
            morseMap.put('A', ".-");
            morseMap.put('B', "-...");
            morseMap.put('C', "-.-.");
            
        }

        public String traducir(String texto) throws ClaveNoEncontradaError {
            StringBuilder morse = new StringBuilder();
            for (char caracter : texto.toUpperCase().toCharArray()) {
                String codigoMorse = morseMap.get(caracter);
                if (codigoMorse == null) {
                    throw new ClaveNoEncontradaError("El caracter '" + caracter + "' no se puede traducir a Morse.");
                }
                morse.append(codigoMorse).append(" ");
            }
            return morse.toString().trim();
        }
    }
