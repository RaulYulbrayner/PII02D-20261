package uniquindio.edu.co;

public class Ejercicio3 {

    public static int sumaNumeros(int numero){
        int suma = 0;
        if(numero>0){
            for(int i = 1; i <= numero; i++){
                suma+=i;
            }
        }else{
            suma = -1;
        }
        return suma;
    }



    public static void main(String[] args) {
        System.out.println("La suma es:" + sumaNumeros(1000));
    }
}
