package factorial;

public class Factorial {

    public static void main(String[] args) {

        int variable;
        int numero;

        variable = 8;

        int cuenta;
        if (variable == 0) {
            numero = 1;
        } else {
            numero = 1;
            for (cuenta = variable; cuenta >= 1; cuenta--) {
                numero = numero * cuenta;
            }
        }

        System.out.println(numero);

    }

}
