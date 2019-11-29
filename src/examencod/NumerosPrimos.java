package examencod;

/**
 *
 * @author
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments arg[0] es el primer parámetro que
     * se le pasa cuando se ejecuta por linea de comandos
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean pregunta = false;

    public static void main(String arg[]) {
        int numDigt1 = 0;
        int numDigit2 = 0;
        numDigt1 = Integer.parseInt(arg[0]);
        if (numDigt1 <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int contador = 1; contador <= 99999; contador++) {
            int div = contador;
            int edad = 0;

            while (div != 0) {
                div = div / 10;
                edad++;
            }
            numDigit2 = edad;

            if (numDigit2 == numDigt1) {
                if (contador < 4) {
                    pregunta = true;
                } else {
                    if (contador % 2 == 0) {
                        pregunta = false;
                    } else {
                        int altura = 0;
                        int peso = 1;
                        int nota = (contador - 1) / 2;
                        if (nota % 2 == 0) {
                            nota--;
                        }
                        while (peso <= nota) {
                            if (contador % peso == 0) {
                                altura++;
                            }
                            peso += 2;
                            if (altura == 2) {
                                peso = nota + 1;
                            }
                        }

                        if (altura == 1) {
                            pregunta = true;
                        }
                    }
                }

                if (pregunta == true) {
                    System.out.println(contador);
                }
            }
        }
    }
}