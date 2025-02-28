import java.util.*;

public class Recuperatorio {

    /* Ejercicio 1 */
    public static int triada(int num1, int num2, int num3){
        if (num1 == num2 && num2 == num3){
            return 3;
        } else if (num1 == num2 || num2 == num3 || num3 == num1){
            return 2;
        } else{
            return 0;
        }
    }


    /* Ejercicio 2 */
    public static String saludo_o_despedida(String nombre, int opcion){
        return switch (opcion) {
            case 1 -> "Hola " + nombre;
            case 0 -> "Chao" + nombre;
            default -> "Error entradas inválidas";
        };
    }

    /* Ejercicio 3 */
    public static int longitud_de_cadena(String word1, String word2, String word3){
        int contador = 0;
        
        String [] words = {word1, word2, word3};

        for (String word : words){
            if (word.length() >= 4){
                contador++;
            }
        }

        return contador;
    }

    /*Ejercicio 4 */
    public static boolean posicion_char(String string1, String string2){
        if (string1.length() < 3 || string2.length() < 3){
            System.out.println("Error: Su nombre es muy corto");
            return  false;
        }
        
        return string1.charAt(2) == string2.charAt(2);
    }

    /* Ejercicio 5 */
    public static double[] formula_cuadratica(double a, double b, double c){
        
        double x_1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c ))/(2*a);
        double x_2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);

        return new double[]{x_1, x_2};
        
    }

    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Digite la opcion");
        System.out.println("1) Triada");
        System.out.println("2) Saludo o Despedida");
        System.out.println("3) Longitud de cadena");
        System.out.println("4) Igualdad en posición 2 de cadenas");
        System.out.println("5) Raices de una ecuación cuadrática");
        int option = reader.nextInt();

        switch (option) {
            case 1:
                int num1, num2, num3;

                System.out.println("Triada:");

                System.out.println("Digite el numero 1 (entero): ");
                num1 = reader.nextInt();
                System.out.println("Digite el numero 2 (entero): ");
                num2 = reader.nextInt();
                System.out.println("Digite el numero 3 (entero): ");
                num3 = reader.nextInt();

                System.out.println(triada(num1, num2, num3) + " numeros son iguales");
                
                break;

            case 2:
                String name;
                int opcion;

                System.out.println("Saludo o Despedida:");
                
                System.out.println("(¿Cual es tu nombre?)");
                name = reader.next();

                System.out.println("Digite (1) para saluda o digite (0) para despedir: ");
                opcion = reader.nextInt();

                System.out.println(saludo_o_despedida(name, opcion));

                break;

            case 3:
                String word1, word2, word3;
                System.out.println("Longitud de cadena:");

                System.out.println("Escribe una palabra: ");
                word1 = reader.next();

                System.out.println("Escribe otra palabra: ");
                word2 = reader.next();

                System.out.println("Escribe la ultima palabra: ");
                word3 = reader.next();

                System.out.println("Se ingresaron: " + word1 + ", " + word2 + "y " + word3 + ", el resultado es: " + longitud_de_cadena(word1, word2, word3));

                break;

            case 4:
                String string1, string2;

                System.out.println("Igualdad en posición 2 de cadenas:");

                System.out.println("Escribe una palabra: ");
                string1 = reader.next();

                System.out.println("Escribe otra palabra: ");
                string2 = reader.next();

                System.out.println("Se ingresaron" + string1 + "y " + string2 + ", el resultado es " + posicion_char(string1, string2));

                break;

            case 5:
                double a, b, c;

                System.out.println("Raices de una ecuación cuadrática:");

                System.out.println("Digite el a: ");
                a = reader.nextDouble();

                System.out.println("Digite el b: ");
                b = reader.nextDouble();

                System.out.println("Digite el c: ");
                c = reader.nextDouble();

                double[] raices = formula_cuadratica(a, b, c);
                System.out.println("x1 = " + raices[0] + ", x2 = " + raices[1]);

                break;

            default:
                System.out.println("Error");
                break;
        }

        reader.close();

    }

}