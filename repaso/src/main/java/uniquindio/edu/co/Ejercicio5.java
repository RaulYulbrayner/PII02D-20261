package uniquindio.edu.co;

public class Ejercicio5 {

    public static String numeroPerfecto(int numero){
        String resultado = "";
        int suma = 0;
        if(numero>0){
            for(int i = 1; i < numero; i++){
                if(numero % i == 0){
                    suma+=i;
                }
            }
            if(suma == numero){
                resultado = "El número es perfecto";
            }else{
                resultado = "El número es NO perfecto";
            }
        }else{
            resultado = "El número no es positivo";
        }
        return resultado;
    }


    public static void main(String[] args) {
        System.out.println(numeroPerfecto(-6));
    }
}
