package uniquindio.edu.co;

public class Ejercicio2 {

    public static String numeroParImpar(int numero) {
        String mensaje = "";
        if(numero % 2 == 0){
            mensaje = "El número es PAR";
        }else{
            mensaje = "El número es IMPAR";
        }
        return mensaje;
    }


    public static void main(String[] args) {
        System.out.println(numeroParImpar(8));
    }
}
